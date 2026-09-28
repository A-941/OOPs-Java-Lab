import java.util.Scanner;

public class Program1_TemperatureStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temps = new double[7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
            sum += temps[i];
        }

        double average = sum / 7.0;
        double highest = temps[0];
        double lowest = temps[0];

        for (int i = 1; i < 7; i++) {
            if (temps[i] > highest) {
                highest = temps[i];
            }
            if (temps[i] < lowest) {
                lowest = temps[i];
            }
        }

        int aboveAverageCount = 0;
        for (int i = 0; i < 7; i++) {
            if (temps[i] > average) {
                aboveAverageCount++;
            }
        }

        System.out.println("Average Temperature: " + average);
        System.out.println("Highest Temperature: " + highest);
        System.out.println("Lowest Temperature: " + lowest);
        System.out.println("Days Above Average: " + aboveAverageCount);

        scanner.close();
    }
}
