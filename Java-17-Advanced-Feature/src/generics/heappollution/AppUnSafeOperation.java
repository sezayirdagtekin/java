package generics.heappollution;
import java.util.ArrayList;
import java.util.List;

public class AppUnSafeOperation {

    public static void main(String[] args) {

        //Raw List
        List dogs=  new ArrayList<Dog>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Lucky"));

       List<? extends Animal> animals=dogs;
        System.out.println(animals);
        //Console: [Dog[name=Daisy], Dog[name=Lucky]]

        List<Dog> dogsAgain= (List<Dog>) animals;
        System.out.println(dogsAgain);
       // Console:  generics.heappollution.AppUnSafeOperation
       //[Dog[name=Daisy], Dog[name=Lucky]]

    }
}
