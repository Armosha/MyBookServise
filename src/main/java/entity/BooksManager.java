package entity;

import parser.JaxBXmlParser;

import java.util.List;

/**
 * Created by Iryna_Filipava1 on 13.04.2017.
 */
public class BooksManager {

    JaxBXmlParser par = new JaxBXmlParser();
    List<Book> booksList = par.unmarshallBooksList();

    public Book getBook(String id) {
        Book book = new Book();

        for (Book p : booksList) {
            if (p.getId().equals(id)) {
                book = p;
            }
        }
        return book;
    }
}
