import java.util.Scanner;

public class ConditionalPractice {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { //creating an input method
            System.out.print("Number: ");
            int number = scanner.nextInt();
            if (number%5 == 0 && number%3 ==0) //checking if its divisible by both 3 and 5
                System.out.println("FizzBuzz");  
            else if (number%3 == 0 ) //checking if its only divisible by 3
                System.out.println("Buzz");
            else if (number%5 == 0) //checking if its only divisible by 5
                System.out.println("Fizz");
            else 
                System.out.println(number); //displaying the number itself
        }
    }
}
    

