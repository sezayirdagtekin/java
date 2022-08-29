package nested.inner;

public class Enclosing {
private  String name="Java";
    Inner createInnerInstance(){
        return this.new Inner();
    }

    class Inner{
        private  String name="Python";

        public void run() {
            System.out.println(name);
            System.out.println(Enclosing.this.name);
        }
    }
}
