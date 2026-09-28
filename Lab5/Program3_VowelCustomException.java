import java.util.Scanner;

class StringNotValidException extends Exception {
    public StringNotValidException(String message) {
        super(message);
    }
}

public class Program3_VowelCustomException {

    public static void checkVowels(String str) throws StringNotValidException {
        String lower = str.toLowerCase();
        boolean hasVowel = false;
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hasVowel = true;
                break;
            }
        }
        if (!hasVowel) {
            throw new StringNotValidException("String does not contain any vowels: " + str);
        }
        System.out.println("Valid string containing vowels: " + str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            checkVowels(input);
        } catch (StringNotValidException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
