import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program1_FileCopyCharStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Enter destination file path: ");
        String destPath = scanner.nextLine();

        try (FileReader reader = new FileReader(sourcePath);
             FileWriter writer = new FileWriter(destPath)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
            System.out.println("File copied successfully from " + sourcePath + " to " + destPath);
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
