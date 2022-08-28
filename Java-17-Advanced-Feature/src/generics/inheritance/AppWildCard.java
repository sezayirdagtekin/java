package generics.inheritance;

import java.util.ArrayList;
import java.util.List;

public class AppWildCard {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Daisy"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Shiba"));
        cats.add(new Cat("Mia"));

        List<Animal> animals = new ArrayList<>();

        System.out.println("Animals  list::" + animals);
        copy(animals, dogs);
        System.out.println("Animals after copy of Dog:" + animals);

        copy(animals, cats);
        System.out.println("Animals after copy of Cat:" + animals);
        System.out.println("Dogs Size:" + size(dogs) + " Cats size:" + size(cats)+" Animals size:" + size(animals));

    }

    // Upper bounded wildcards for in parameters
    //Lower bounded wildcards for out parameters
    public static <T> List<? super T> copy(List<? super T> dest, List<? extends T> src) {
        dest.addAll(src);
        return dest;
    }


    //Unbounded wildcard if the method does not need to know what the wildcard stands for

    public static int size(List<?> list) {
        return list != null || !list.isEmpty() ? list.size() : 0;
    }
}
