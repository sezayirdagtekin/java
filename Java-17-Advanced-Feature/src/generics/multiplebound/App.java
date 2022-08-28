package generics.multiplebound;

import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        var p1 = new Person(106, "Sezayir", "Java Developer");
        var p2 = new Person(105, "Cem", "Test Engineer");
        var p3 = new Person(104, "John", "Devops Engineer");

        var people = List.of(p1, p2, p3);
        System.out.println(sortByIdAndGetNames(people));
    }

    public static <T extends HasId & HasName> List<String> sortByIdAndGetNames(List<T> people) {
        return people.stream().sorted(Comparator.comparing(HasId::id)).map(HasName::name).toList();
    }
}
