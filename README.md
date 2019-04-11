# stc-speechkit-java

SpeechKit contains java client libraries for SpeechPro Cloud.

### ASR (Automated Speech Recognition)

asr is a client library for speech recognition technology.
There is a usage exmaple in Main class https://github.com/STC-VoiceKey/stc-speechkit-java/tree/master/asr/src/main/java/com/speechpro/cloud/client/main.
This example demonstrates web socket speech recogntion. Sound streaming should be implemented by the user. As an example recognition of a sound file is given.  

For stream (web socket) speech recognition several sound formats are supported:  
**RAW PCM** audio data with sampling frequency of 16 kHz and quantization of 16 bit, little-endian byte order;  
**WAV** audio data.
