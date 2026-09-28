import java.util.Scanner;

public class Program2_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int c1 = scanner.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int r2 = scanner.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int c2 = scanner.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible. Columns of first must equal rows of second.");
            scanner.close();
            return;
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
