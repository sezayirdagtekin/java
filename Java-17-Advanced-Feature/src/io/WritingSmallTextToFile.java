package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class WritingSmallTextToFile {

    static final String URI = "./Java-17-Advanced-Feature/src/io/newFile.txt";
    static final String URI2 = "./Java-17-Advanced-Feature/src/io/test.txt";

    public static void main(String[] args) throws IOException, InterruptedException {

        Path path1 = Path.of(URI);

        List<String> lines = List.of("Hi There", "How are you?", "Good!");
        writeFile(path1, lines);


        Path path2 = Path.of(URI2);
        copy(path1, path2);

        Thread.sleep(2000);
        delete(path1);
        delete(path2);

    }

    private static void writeFile(Path path1, List<String> lines) throws IOException {

        String text = lines.stream().collect(Collectors.joining("\n"));
        //Create new file if file does not exist
        Files.writeString(path1, text, StandardOpenOption.CREATE);// Do not use in for loop!Costly
        System.out.println(String.format("Writing file %s  is done", path1.getFileName()));
    }

    public static void copy(Path path1, Path path2) throws IOException {

        Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
        System.out.println(String.format("copy file %s  to %s is done", path1.getFileName(), path2.getFileName()));
    }

    public static void delete(Path path) throws IOException {
        Files.deleteIfExists(path);
        System.out.println(String.format("%s file is deleted!", path.getFileName()));
    }
}
