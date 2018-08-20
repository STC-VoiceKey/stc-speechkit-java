package com.speechpro.cloud.client.api;

import com.neovisionaries.ws.client.*;
import com.speechpro.cloud.client.ApiResponse;
import com.speechpro.cloud.client.model.WebSocketServerConfiguration;

import java.io.IOException;
import java.util.UUID;


/**
* Created by sadurtinova on 21.06.2018.
*/


public class WebSocketApi {

    private WebSocket ws;

    UUID transactionId;

    private WebSocketAdapter wsAdapter;

    public UUID getTransactionId(){
        return transactionId;
    }

    public WebSocketApi(String webSocketAddress, int timeout, WebSocketAdapter adapter) {
        WebSocketFactory factory = new WebSocketFactory();
        ProxySettings settings = factory.getProxySettings();
        factory.setVerifyHostname(false);
        try {
            ws = factory.createSocket(webSocketAddress, timeout);
        } catch (IOException e) {
            e.printStackTrace();
        }
        wsAdapter = adapter;
    }

    public WebSocketApi(ApiResponse<WebSocketServerConfiguration> apiResponse, int timeout, WebSocketAdapter adapter){
        WebSocketFactory factory = new WebSocketFactory();
        wsAdapter = adapter;
        ProxySettings settings = factory.getProxySettings();
        factory.setVerifyHostname(false);
        try {
            ws = factory.createSocket(apiResponse.getData().getUrl(), timeout).addExtension(WebSocketExtension.PERMESSAGE_DEFLATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ws.addListener(wsAdapter);
        //wsAdapter = adapter;
        transactionId = UUID.fromString(apiResponse.getHeaders().get("X-Transaction-Id").get(0));
    }

    public void connect() {
        try {
            ws.connect();
        } catch (WebSocketException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

