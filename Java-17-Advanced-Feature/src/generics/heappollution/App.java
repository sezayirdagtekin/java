package generics.heappollution;



import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //Raw List
        List dogs=  new ArrayList<Dog>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Lucky"));

        List<Cat> cats= dogs; //OK. Allowed

        System.out.println(cats);
       // Console= [Dog[name=Daisy], Dog[name=Lucky]]

        Cat cat= cats.get(0);
       // Exception in thread "main" java.lang.ClassCastException: class generics.heappollution.
       // Dog cannot be cast to class generics.heappollution.Cat (generics.heappollution.Dog and generics.heappollution.

    }
}
