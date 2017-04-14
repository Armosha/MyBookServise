package web;

import entity.Request;
import entity.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Iryna_Filipava on 14.04.2017.
 */
public class ClientSession implements Runnable {

    private Socket socket;
    private InputStream in = null;
    private OutputStream out = null;
    Request req;
    Response resp;


    public ClientSession(Socket socket) throws IOException {
        this.socket = socket;
        starting();
    }

    @Override
    public void run() {

        req = new Request(in);
        resp = new Response(out);


    }

    private void starting() throws IOException {

        in = socket.getInputStream();
        out = socket.getOutputStream();
    }

}
