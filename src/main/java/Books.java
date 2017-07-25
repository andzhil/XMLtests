import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Books {

    private ArrayList<Book> onebook;

    public Books () {
        this.onebook = new ArrayList<Book>();
    }

    public Books (Book book) {
        this.onebook = new ArrayList<Book>();
        this.onebook.add(book);
    }

    public void addBook(Book book) {
        this.onebook.add(book);
    }

    @Override
    public String toString() {
        String bookstostring = "Books{";
        for (Book book : onebook) {
            bookstostring += book.toString();
        }
        return bookstostring + "}";
    }
}
