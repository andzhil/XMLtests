import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    private String name;
    private String author;
    private Chapters chapters;
    private int year;

    public Book() {
    }

    public Book(String name, String author, int year, Chapters chapters) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", year=" + year +
                "chapterNames=" + chapters + "}";
    }
}
