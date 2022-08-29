package generics.erasure;

public class AppErasure {

    public static void main(String[] args) {

        System.out.println(new Customer<>() instanceof Customer); // true
        System.out.println(new Customer<>() instanceof Object);// true
        //Inconvertible types; cannot cast 'generics.erasure.Customer<java.lang.Object>' to 'java.lang.String'
        //System.out.println(new Customer<>() instanceof String); // Compilation error
    }

}
