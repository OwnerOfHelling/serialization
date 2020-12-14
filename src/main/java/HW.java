import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HW {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Pizza pizza = new Pizza();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
        outputStream.writeObject(pizza);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"));
        Pizza restartPizza = (Pizza) inputStream.readObject();
        System.out.println(restartPizza.toString());

        /*Gson gson = new Gson();
        String jsonString = gson.toJson(pizza);
        File file = new File("pizza.json");
        Files.write(Paths.get("pizza.json"), jsonString.getBytes());

        String jsonInputString = new String(Files.readAllBytes(Paths.get("pizza.json")));
        Pizza restartPizza = gson.fromJson(jsonInputString, Pizza.class);
        System.out.println(restartPizza);*/

    }
}
