import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Print spaces for formatting
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");

                number = number * (i - j) / (j + 1);
            }
            System.out.println(); // Move to the next row
        }
    }
}
