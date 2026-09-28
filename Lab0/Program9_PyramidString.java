import java.util.Scanner;

public class Program9_PyramidString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
                if (j < i - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
