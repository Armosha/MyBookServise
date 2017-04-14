package entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Iryna_Filipava1 on 13.04.2017.
 */
@XmlRootElement(name = "book")
public class Book {

    @XStreamAlias("id")
    private String id;

    @XStreamAlias("name")
    private String name;

    @XStreamAlias("author")
    private String author;


    public Book() {
        super();
    }

    public Book(String id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;

    }

    @XmlElement
    public String getId() {
        return id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (author != null && name != null && id != null) {
            str = str.append("User id is: " + id)
                    .append("\n")
                    .append("User name is: " + name)
                    .append("\n")
                    .append("User family name is: " + author);

        }
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!id.equals(book.id)) return false;
        if (!name.equals(book.name)) return false;
        return author.equals(book.author);
    }


    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
