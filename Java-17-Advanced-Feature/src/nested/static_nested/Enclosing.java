package nested.static_nested;

import java.time.LocalDate;

public class Enclosing {
    private String name;
    private static int code = 1;
    private static LocalDate localDate = LocalDate.of(2022, 8, 9);

    private static void print() {
        System.out.println("This enclosing static method");
    }

    public void sayHello() {
        System.out.println("helo:" + name);
    }

    private static void printDate() {
        System.out.println("Enclosing static printDate method" + localDate);
    }

    static class Nested {

        //Variable  defined with same name
        private static LocalDate localDate = LocalDate.of(2022, 10, 28);

        //Method defined with same name
        private static void printDate() {
            System.out.println("Neste static printDate method" + localDate);
        }

        public void run() {
            //Can acces enclosing class members(variables & methods)
            System.out.println(code);
            print();


            //Non-static field 'name' cannot be referenced from a static context
            // System.out.println(name);

            //Non-static method 'sayHello()' cannot be referenced from a static context
            //sayHello();

            //Nested class methods
            printDate();

            //Enclosing method
            Enclosing.printDate();
        }

    }
}
