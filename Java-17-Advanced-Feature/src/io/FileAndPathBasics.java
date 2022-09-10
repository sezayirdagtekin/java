package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAndPathBasics {

    // File.separator '/' work for both Windows ,Unix, Linux
   static final String URL= "./Java-17-Advanced-Feature/src/io/test.txt";


    public static void main(String[] args) throws IOException {
        String separator=File.separator;
        System.out.println(separator); //  print  '\'



        System.out.println(System.getProperty("user.dir"));   //D:\Java-17-Advanced-Feature
        System.out.println(Path.of("").toAbsolutePath()); //D:\Java-17-Advanced-Feature

        File file = new File(URL);
        System.out.println(file.exists()); //True

        Path path= Path.of(URL);
        System.out.println(Files.exists(path)); //True

        if(isFileAccessible(path)){
           String lines= Files.readString(path);
            System.out.println(lines);
        }

    }

    private static boolean isFileAccessible(Path path) {
        return Files.isRegularFile(path) && Files.isReadable(path);
    }
}
