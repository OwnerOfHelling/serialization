import java.io.Serializable;

public class Dough implements Serializable {

    String size = "30scm";
    String type = "lush";

    @Override
    public String toString() {
        return "Dough{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
