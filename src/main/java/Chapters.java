import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "chapters")
@XmlAccessorType(XmlAccessType.FIELD)
public class Chapters {
    private String chapter1;
    private String chapter2;

    public Chapters() {
    }

    @Override
    public String toString() {
        String chapters = "Chapters{";
        chapters += chapter1 + ", " + chapter2;
        return chapters + "}";
    }
}
