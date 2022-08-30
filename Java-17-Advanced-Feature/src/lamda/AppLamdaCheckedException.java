package lamda;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class AppLamdaCheckedException {
    public static void main(String[] args) {


        var names = List.of("Joe Smith", "Susan Miller", "Will Johnson");


        try (FileWriter out = new FileWriter("names.txt", UTF_8)) {

            // default void forEach(Consumer<? super T> action)  takes consumer
            //  accept method does not throw checked exception
            // so that we surrounded with try catch
            names.forEach(name -> {
                try {
                    out.write(name + "\n");
                } catch (IOException e) { //Checked exception
                    throw new RuntimeException(e); //Unchecked exception
                }
            });

        } catch (IOException | RuntimeException e) { //Not best way!
            System.out.println("An error occurred!");
        }

    }
    }
