import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2_MergeAudioFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first audio file path: ");
        String file1 = scanner.nextLine();
        System.out.print("Enter second audio file path: ");
        String file2 = scanner.nextLine();
        System.out.print("Enter output merged audio file path: ");
        String outputFile = scanner.nextLine();

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis1.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            while ((bytesRead = fis2.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Audio files merged successfully into: " + outputFile);
        } catch (IOException e) {
            System.out.println("Error merging audio files: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
