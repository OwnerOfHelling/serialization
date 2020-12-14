import java.io.Serializable;

public class Pizza implements Serializable {

    Dough dough = new Dough();
    String filling = "meaty";

    @Override
    public String toString() {
        return "Pizza{" +
                 dough +
                ", filling='" + filling + '\'' +
                '}';
    }

}
