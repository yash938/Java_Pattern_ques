public class Pattern9 {
    public static void main(String[] args) {
        int num = 5;

                int n = 5; // Number of rows

                for (int i = 0; i < n; i++) {
                    // Print spaces
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    // Print stars
                    for (int j = 0; j < (2 * (n - i) - 1); j++) {
                        System.out.print("*");
                    }
                    // Move to the next line
                    System.out.println();
                }
            }
        }

