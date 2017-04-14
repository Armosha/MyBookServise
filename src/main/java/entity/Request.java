package entity;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Iryna_Filipava1 on 14.04.2017.
 */
public class Request {

    private InputStream in;
    private String url;
    private List<String> header;
    private List<String> body;
    private String content;
    private String method;

    public Request(InputStream in) {
        this.in = in;
    }
}
