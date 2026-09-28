import java.util.Scanner;

public class Program8_VowelFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalA = 0;
        int totalE = 0;
        int totalI = 0;
        int totalO = 0;
        int totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            int a = 0;
            int e = 0;
            int i = 0;
            int o = 0;
            int u = 0;
            String lower = input.toLowerCase();
            for (int k = 0; k < lower.length(); k++) {
                char ch = lower.charAt(k);
                if (ch == 'a') a++;
                else if (ch == 'e') e++;
                else if (ch == 'i') i++;
                else if (ch == 'o') o++;
                else if (ch == 'u') u++;
            }
            System.out.println("Sentence Vowels -> A: " + a + ", E: " + e + ", I: " + i + ", O: " + o + ", U: " + u);
            totalA += a;
            totalE += e;
            totalI += i;
            totalO += o;
            totalU += u;
        }

        System.out.println("Total Vowel Counts across all sentences:");
        System.out.println("A: " + totalA);
        System.out.println("E: " + totalE);
        System.out.println("I: " + totalI);
        System.out.println("O: " + totalO);
        System.out.println("U: " + totalU);
        scanner.close();
    }
}
