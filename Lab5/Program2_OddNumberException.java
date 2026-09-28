import java.util.Scanner;

public class Program2_OddNumberException {

    public static void checkEven(int number) {
        if (number % 2 != 0) {
            throw new NumberFormatException("Number is odd: " + number);
        }
        System.out.println("Valid even number: " + number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        try {
            checkEven(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
