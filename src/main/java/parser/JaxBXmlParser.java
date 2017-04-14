package parser;

import entity.Book;
import entity.Books;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

/**
 * Created by Iryna_Filipava1 on 13.04.2017.
 */
public class JaxBXmlParser {

    List<Book> booksList;

    public List<Book> unmarshallBooksList() {

        try {
            JAXBContext jc = JAXBContext.newInstance(Books.class);
            Unmarshaller um = jc.createUnmarshaller();
            Books books = (Books) um.unmarshal(new File("src\\main\\resources\\booksbase.xml"));
            booksList = books.getListPassengers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return booksList;
    }




}
