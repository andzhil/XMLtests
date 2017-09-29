import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.*;
import java.io.File;

public class BooksTest {

    private JAXBContext context;

    @Before
    public void doBefore() throws JAXBException {
        this.context = JAXBContext.newInstance(Books.class);
    }

    @Test
    public void testMethod() throws JAXBException {
        //Marshaller marshaller = this.context.createMarshaller();
        //Books books = new Books(new Book("The Mist", "Stephen King", 1990));
        //books.addBook(new Book("Fathers and Children", "Turgenev", 1850));
        //marshaller.marshal(books, new File("Books.xml"));

        Unmarshaller unmarshaller = this.context.createUnmarshaller();
        System.out.println(unmarshaller.unmarshal(new File("Books.xml")));
        Books books = (Books)unmarshaller.unmarshal(new File("Books.xml"));
        for (Book book : books.getBooks()) {
            System.out.println(book.toString());
        }
    }

}
