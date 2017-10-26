package com.ketech;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

public class WebSocketTest
{
    public static void main(String[] args) throws Exception {
        WebSocketClient webSocketClient = new WebSocketClient(new URI("ws://femtocellsms.sjws.baidu.com/openfemtocellsms")) {
            @Override
            public void onOpen(ServerHandshake serverHandshake) {
                System.out.println("**********Open**********");
            }

            @Override
            public void onMessage(String s) {
                System.out.println("**********Message**********");
                System.out.println(s);
            }

            @Override
            public void onClose(int i, String s, boolean b) {
                System.out.println("**********Close**********");
                this.connect();
            }

            @Override
            public void onError(Exception e) {
                System.out.println("**********Error**********");
            }
        };
        webSocketClient.connect();
    }
}
