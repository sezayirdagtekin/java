package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryOperation {


    public static void main(String[] args) throws IOException, InterruptedException {

        createDirectory("directory");
        createDirectories("directory/subdirectory");

        Thread.sleep(2000);

        //use apache-commons library
        //"main" java.nio.file.DirectoryNotEmptyException: directory
        deleteDirectory("directory");

    }


    public static void createDirectory(String uri) throws IOException {
        Path path= Path.of(uri);
        if(!Files.exists(path)){
            Files.createDirectory(path);
        }

    }

    public static void createDirectories(String uri) throws IOException {
        Path path= Path.of(uri);
        if(!Files.exists(path)){
            Files.createDirectories(path);
        }
    }

    //Do not use this! Exception:  java.nio.file.DirectoryNotEmptyException: directory
    public static void deleteDirectory(String uri) throws IOException {
        Path path=Path.of(uri);
        if(Files.exists(path)){
            Files.delete(path);
        }

    }

}
