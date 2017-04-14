package web;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Iryna_Filipava1 on 14.04.2017.
 */
public class Server {

    ServerSocket serverSocket;
    Socket clientSocket;
    int port;

    public Server() {

    }

    public void createSocket() {

        serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port: " + serverSocket.getLocalPort() + "\n");
        } catch (IOException e) {
            System.out.println("Port " + port + " is blocked.");
            System.exit(-1);
        }
    }


//ToDo


}
