package github;

import java.util.Random;
import java.util.Scanner;

public class Rocke_paper_scissor {
    public static void main(String[] args) {
        System.out.println("This is a game of rock, paper and scissors");
        Scanner kb = new Scanner(System.in);
        String[] choices = new String[3];
        Random random = new Random();

       
        choices[0] = "rock";
        choices[1] = "paper";
        choices[2] = "scissors";

        int count = 0;

        while(true){
            int ran = random.nextInt(3);
            String computer = choices[ran];

            System.out.print("Rock, paper or scissor: ");
            String user = kb.nextLine();

            System.out.println("The computer chose: " + computer);

            if(computer.equals(user)){
                System.out.println("Draw!");
                continue;
            }
            if(computer.equals("paper")){
                if(user.equals("rock")){
                    System.out.println("you tried :)");
                }else if(user.equals("scissors")){
                    System.out.println("You are correct!!");
                }
            } 
            
            
            
            
        }     
    }
}
