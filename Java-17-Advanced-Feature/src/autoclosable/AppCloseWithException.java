package autoclosable;

import autoclosable.resources.Door;
import autoclosable.resources.MyResource;

public class AppCloseWithException {
    public static void main(String[] args) {


        try (Door door1 = new Door("First Door"); MyResource resource = new MyResource("Second Door") ) {
            System.out.println("Inside try block...");
            throw new Exception();
        }
        catch(Exception e){
            System.out.println("Inside catch block...");// Execute after closing resources
        }

    }
}

//Console output:

//First Door is opening.
//Second Door is opening.
//Inside try block...
//Second Door is closed.
//First Door is closed.
//Inside catch block...

