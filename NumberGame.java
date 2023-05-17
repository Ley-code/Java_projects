package github;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        Scanner kb = new Scanner(System.in);
        int guess;
        boolean hasWon = false;
        
        while (!hasWon) {
            System.out.print("Take a guess: ");
            guess = kb.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasWon = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        kb.close();
    }  
}
