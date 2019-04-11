package com.speechpro.cloud.client.main;

import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketAdapter;
import com.neovisionaries.ws.client.WebSocketException;
import com.speechpro.cloud.client.ApiClient;
import com.speechpro.cloud.client.ApiException;
import com.speechpro.cloud.client.ApiResponse;
import com.speechpro.cloud.client.api.RecognizeApi;
import com.speechpro.cloud.client.api.SessionApi;
import com.speechpro.cloud.client.api.WebSocketApi;
import com.speechpro.cloud.client.model.SessionDto;
import com.speechpro.cloud.client.model.StartSessionRequest;
import com.speechpro.cloud.client.model.StreamRequestDto;
import com.speechpro.cloud.client.model.WebSocketServerConfiguration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // for Websocket connection nv-websocket-client is used here
        ApiClient apiClient = new ApiClient();
        SessionApi sessionApi = new SessionApi(apiClient);
        StartSessionRequest startSessionRequest = new StartSessionRequest("user", "password", 200L);
        SessionDto sessionDto = null;
        try {
            sessionDto = sessionApi.startSession(startSessionRequest);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        UUID sessionId = sessionDto.getSessionId();
        RecognizeApi recognizeApi = new RecognizeApi();
        ApiResponse<WebSocketServerConfiguration> apiResponse = null;
        StreamRequestDto streamRequestDto = new StreamRequestDto("CommonRus", "audio/l16");
        try {
            apiResponse = recognizeApi.startWithHttpInfo(sessionId, streamRequestDto);
        } catch (ApiException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Web socket URL: " + apiResponse.getData());
        byte[] fileContentRaw = new byte[0];
        try {
            fileContentRaw = Files.readAllBytes(new File("C:\\test.wav").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // you should implement methods for different events
        WebSocketApi webSocketApi = new WebSocketApi(apiResponse.getData().getUrl(), 5000,
                new WebSocketAdapter() {
                    @Override
                    public void onTextMessage(WebSocket websocket, String message) {
                        System.out.println(message);
                    }

                    @Override
                    public void onConnected(WebSocket websocket, Map<String, List<String>> headers) {
                        System.out.println("Connected");
                    }

                    @Override
                    public void onError(WebSocket websocket, WebSocketException cause){
                        System.out.println("Error!");
                        System.out.println(cause.getMessage());
                    }

                });
        webSocketApi.connect();
        webSocketApi.sendBytes(fileContentRaw);
    }
}
