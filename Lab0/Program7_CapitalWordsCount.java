import java.util.Scanner;

public class Program7_CapitalWordsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().trim();
        int count = 0;
        if (!line.isEmpty()) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                    count++;
                }
            }
        }
        System.out.println("Words starting with capital letter: " + count);
        scanner.close();
    }
}
