package nested.inner;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Enclosing enclosing = new Enclosing();
        Enclosing.Inner  inner = enclosing.new Inner();
        //short way
        //Enclosing.Inner inner = new Enclosing().new Inner();

       inner.run();
       new ArrayList<>();

    }

}
