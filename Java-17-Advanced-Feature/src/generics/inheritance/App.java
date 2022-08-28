package generics.inheritance;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //Rule: With generic types, Java has no way of knowing at runtime the type information of the type parameters,
        // due to type erasure. Therefore, it cannot protect against heap pollution at runtime.
        // As such, generics are invariant. The type parameters must match exactly, to protect against heap pollution.


        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Daisy"));


       // List<Animal>  animals= dogs;  //Error!

        // Suppose that  allowed. Then we could add Cat to list of Dogs!
        //animals.add(new Cat("Shiba"));

        //Using wildcard
        List<? extends  Animal> animals= dogs; //OK
        //animals.add(new Cat("Shiba")); //Still error
        // animals.add(new Dog("Max"));   //Still error

    }

}


interface  Animal{ }

record  Dog(String name) implements  Animal{ }

record  Cat(String name) implements Animal{}