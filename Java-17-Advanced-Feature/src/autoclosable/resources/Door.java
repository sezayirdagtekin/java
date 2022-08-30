package autoclosable.resources;

public class Door  implements AutoCloseable{

    private String  name;

    public Door(String name){
        System.out.println(name+ " is opening.");
        this.name=name;
    }
    @Override
    public void close() throws Exception {
        System.out.println(name+ " is closed.");

    }
}
