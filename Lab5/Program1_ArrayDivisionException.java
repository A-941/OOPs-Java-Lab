import java.util.Scanner;

public class Program1_ArrayDivisionException {
    public static void main(String[] args) {
        int[] arr = {10, 20, 0, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array elements: [10, 20, 0, 40, 50]");
        System.out.print("Enter index i: ");
        int i = scanner.nextInt();
        System.out.print("Enter index j: ");
        int j = scanner.nextInt();

        try {
            int result = arr[i] / arr[j];
            System.out.println("arr[" + i + "] / arr[" + j + "] = " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index accessed.");
        } finally {
            scanner.close();
        }
    }
}
