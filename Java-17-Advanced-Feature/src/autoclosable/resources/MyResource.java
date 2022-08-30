package autoclosable.resources;

public class MyResource implements AutoCloseable {
    private String name;

    public MyResource(String name) {
        System.out.println(name + " is opening.");
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        System.out.println(name + " is closed.");
        // Let say throw exception
        throw new Exception("Exception throws  while closing resources! "+name);
    }
}