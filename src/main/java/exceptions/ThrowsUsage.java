package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Task:
 * Uncomment code and modify "outputContentOfFile" method declaration
 * to specify that it might throw an exception.
 * Other parts of a program, modify accordingly.
 * 
 * Задача:
 *  Раскомментируйте код и измените объявление метода outputContentOfFile, чтобы указать, что он может вызвать исключение.
 *  Соответственно измените другие части программы.
 */
public class ThrowsUsage {
    public static void main(String[] args)  {
        final Path folderPath = Paths.get(System.getProperty("user.dir") + "/src/main/java/exceptions");
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file name to read: ");
        String fileName = scanner.nextLine();

        Path fullFilePath = folderPath.resolve(fileName);
        try {
            outputContentOfFile(fullFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outputContentOfFile(Path fullFilePath) throws IOException {
        BufferedReader reader = Files.newBufferedReader(fullFilePath); {
            String nextLine = reader.readLine();
            while (nextLine != null) {
                System.out.println(nextLine);
                nextLine = reader.readLine();
            }
        }
    }
}
