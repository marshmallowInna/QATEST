package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.Files.newBufferedReader;

/**
 * Task:
 * Uncomment code and provide the "try-catch-finally" block
 * to handle a checked exception and close the reader object.
 * 
 * Задача:
 * Раскомментируйте код и предоставьте блок "try-catch-finally"
 * для обработки отмеченного исключения и закрытия reader объекта.
 */
public class HandlingCheckedException {
    public static void main(String[] args) {

       final Path folderPath = Paths.get(System.getProperty("user.dir") + "/src/main/java/exceptions");
        final Scanner scanner = new Scanner(System.in);
        //System.out.println(System.getProperty("user.dir"));
        System.out.print("Enter a file name to read: ");
        String fileName = scanner.nextLine();

        Path fullFilePath = folderPath.resolve(fileName);
        BufferedReader reader = null;

        try {
            reader = newBufferedReader(fullFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String nextLine = null;

        try {
            nextLine = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.err.println(" uuuuuu");
        while (nextLine != null) {
            System.err.println(nextLine);
            try {
                nextLine = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();

            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.err.println(" Entering finally block ");
            }
        }
    }
}

