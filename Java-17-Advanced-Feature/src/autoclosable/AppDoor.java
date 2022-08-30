package autoclosable;

import autoclosable.resources.Door;

public class AppDoor {
    public static void main(String[] args) throws Exception {


        try (Door door1 = new Door("First Door"); Door door2 = new Door("Second Door") ) {
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