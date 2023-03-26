import java.util.Scanner;

public class PositiveNumberSum {
    
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a positive number: ");
        number = kb.nextInt();

        while (number>=0){
            sum += number;
            System.out.print("Enter a positive number: ");
            number = kb.nextInt();
        }
        System.out.println("The sum of the positive numbers is: " + sum);
        kb.close();
    
    }
}
