import java.util.Scanner;

public class Program4_StudentPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += scanner.nextDouble();
        }
        double percentage = (total / 600.0) * 100;
        System.out.println("Total Marks: " + total + " / 600");
        System.out.println("Percentage: " + percentage + "%");
        scanner.close();
    }
}
