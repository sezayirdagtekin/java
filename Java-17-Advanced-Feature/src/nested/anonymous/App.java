package nested.anonymous;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {


        var names = new ArrayList<>(List.of("Java", "php", "javascript", "python"));

        //Rule 1:  No constructor in anonymous class

        Comparator<String> compare = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
                //or to use Integer.compare(a,b) method
                //return Integer.compare(s1.length() ,s2.length());
            }
        };

        // Best way is to use lambda
        // 1.  Comparator<String> lambda = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        // 2.  names.sort(Comparator.comparingInt(String::length);

         names.sort(compare);
         System.out.println(names);

    }
}
