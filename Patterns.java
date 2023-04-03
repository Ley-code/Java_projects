public class Patterns {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            // Print the numbers in each row
            for (int k = i; k >= 1; k--) {
                System.out.print(k + "  ");
            }
            // Print a newline after each row
            System.out.println();
        }
    }
}

