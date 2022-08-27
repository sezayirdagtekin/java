package nested.local_class;

public class Enclosing {

    private String title = "Java 17";
    static String code = "EN";

    public void method(int x, int y) {

        int val = 23;//this is final effectively
        // val=24; //Gives error in local class
        title = "Java 17 new features"; //works fine in local class

        //Rule 1:  Local(method) class can not be static.
        //Rule 2    :  Local(method) class can not be private, public,protected
        class Local {
            void method() {

                System.out.println(title);
                var total = x + y + val;
                System.out.println("Local method " + total);
            }

            static void staticMethod() {
                //Non-static variable 'val' cannot be referenced from a static contex
                // System.out.println(val);

                //Non-static field 'title' cannot be referenced from a static context
                // System.out.println(title);

                System.out.println(code);

                //Non-static parameter 'x'  & y cannot be referenced from a static context
                //System.out.println(x+y);

            }

        }

        var local = new Local();
        local.method();

    }//end method

}
