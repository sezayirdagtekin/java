package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class ReadingSmallFile {

    // File.separator '/' work for both Windows ,Unix, Linux
    static final String URL = "./Java-17-Advanced-Feature/src/io/test.txt";


    public static void main(String[] args) throws IOException {


        Path path = Path.of(URL);
        // str.lines()... if you want
       String  str= readSmallFile(path);
       System.out.println(str);

       //  list.stream()...
       List<String> list=readLineByLine(path);

        System.out.println(list);

    }

    public static String readSmallFile(Path path) throws IOException {

        if (isFileAccessible(path)) {
           // return Files.readString(path, StandardCharsets.UTF_8);
            return Files.readString(path);
        }
        return null;
    }

    public static List<String> readLineByLine(Path path) throws IOException {

        if (isFileAccessible(path)) {
            return Files.readAllLines(path);
        }
        return Collections.emptyList();
    }

    private static boolean isFileAccessible(Path path) {
        return Files.isRegularFile(path) && Files.isReadable(path);
    }
}
