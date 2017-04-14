package entity;

import java.io.OutputStream;

/**
 * Created by Iryna_Filipava1 on 14.04.2017.
 */
public class Response {

    private static final int BUFFER_SIZE = 2048;
    private Request req;
    private OutputStream out;
    private String message;

    public Response(OutputStream out) {
        this.out = out;
    }
}
