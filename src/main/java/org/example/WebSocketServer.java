package org.example;

import org.glassfish.tyrus.server.Server;

import javax.websocket.DeploymentException;
import java.util.HashMap;
import java.util.Map;

public class WebSocketServer {
    public static void main(String[] args) {
        Server server = new Server("localhost", 8080, "/ws", null, MyServerEndpoint.class);

        try {
            server.start();
            System.out.println("WebSocket server started at ws://localhost:8080");
            System.out.println("Pres any key to stop the server...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
        }

    }
}
