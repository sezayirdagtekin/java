package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReadingBigFile {

    // File.separator '/' work for both Windows ,Unix, Linux
    static final String URL = "./Java-17-Advanced-Feature/src/io/test.txt";


    public static void main(String[] args) throws IOException {
        Path path = Path.of(URL);

        readingBigFile(path);
        readingBigFileWithStream(path);

    }

    public static void readingBigFile(Path path) throws IOException {

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            throw new RuntimeException("Something went wrong" + e.getMessage());
        }
    }

    public static void readingBigFileWithStream(Path path) throws IOException {

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong" + e.getMessage());
        }
    }

    private static boolean isFileAccessible(Path path) {
        return Files.isRegularFile(path) && Files.isReadable(path);
    }
}
