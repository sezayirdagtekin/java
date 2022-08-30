package autoclosable;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class AppTryWithResources {

    public static void main(String[] args) {

    }


    public static void removeEmptyLines1(String inputFileName, String outputFileName) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
             BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8))) {
            // Copy all non-empty lines from input to output
            String line;
            while ((line = in.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    out.write(line);
                    out.write(System.lineSeparator());
                }
            }
        }
    }



    // Many boilerplate code!!!
    public static void removeEmptyLines2(String inputFileName, String outputFileName) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
            out = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8));

            // Copy all non-empty lines from input to output
            String line;
            while ((line = in.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    out.write(line);
                    out.write(System.lineSeparator());
                }
            }
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.err.println("Error while closing output file: " + e.getMessage());
                }
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println("Error while closing input file: " + e.getMessage());
                }
            }
        }
    }
}
