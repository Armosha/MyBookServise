package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Iryna_Filipava1 on 13.04.2017.
 */

@XmlRootElement(name = "books")
public class Books {
    private List<Book> booksList;

    @XmlElement(name = "book")
    public List<Book> getListPassengers() {
        return booksList;
    }

    public void setListPassengers(List<Book> pasList) {
        this.booksList = pasList;
    }

    @Override
    public String toString() {
        return "BooksList{" +
                "booksList=" + booksList +
                '}';
    }



}
