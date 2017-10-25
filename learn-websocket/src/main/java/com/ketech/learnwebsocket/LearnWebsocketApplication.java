package com.ketech.learnwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;

@SpringBootApplication
public class LearnWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnWebsocketApplication.class, args);


		StandardWebSocketClient standardWebSocketClient = new StandardWebSocketClient();
		WebSocketStompClient webSocketStompClient = new WebSocketStompClient();
	}
}
