import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        int rows = 6;
        // pattern A
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
        System.out.println();
        System.out.println("----------------");
        System.out.println();
        // Pattern B
        for (int i = 1; i<=6 ; i++){
            for ( int j = 1 ; j <= i - 1 ; j++) //
                System.out.print("   ");

            
            for( int j = 1 ; j <= (rows - i) + 1; j++)
                System.out.print(j+"  ");
            System.out.println();
            
        }
        System.out.println();
        System.out.println("----------------");
        System.out.println();
        //Pattern C
        for (int i = 1; i <=8 ; i++){
            for (int j = 1; j <= (8 - i); j++)
                System.out.print("    ");
            for (int k = 1; k <= (i); k++)
                System.out.printf("%4d", (int)(Math.pow(2,(k-1))));
            for (int l = (i-1); l>=1 ; l--)
                System.out.printf("%4d", (int)(Math.pow(2, (l-1))));

            System.out.println();
        }
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        
        //Pattern D
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int row = kb.nextInt();

        for (int i = 1 ; i <= row ; i++) {
            for ( int j = 1 ; j <= (row-i) ; j++){
                System.out.print("   ");
            }
            for ( int j = i ; j >= 1; j--){
                System.out.printf("%3d", j);
            }
            for ( int k = 2 ; k <= (i); k++ ){
                System.out.printf("%3d", k);
            }
            System.out.println();

        }
        kb.close();
    }
}
