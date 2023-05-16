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
        choices[2] = "scissor";
        int rounds = 0;
        int count = 0;

        while(rounds < 10){
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
                }else if(user.equals("scissor")){
                    System.out.println("You are won!!");
                    count+=1;
                }
            }else if(computer.equals("rock")){
                if(user.equals("paper")){
                    System.out.println("You won!!");
                    count+=1;
                }else if(user.equals("scissor")){
                    System.out.println("you tried :)");
                }
            }else if(computer.equals("scissor")){
                if(user.equals("rock")){
                    System.out.println("you won!!");
                    count+=1;
                }else if(user.equals("paper")){
                    System.out.println("you tried :)");
                }
            }
            rounds +=1;    
            
        }
        System.out.println("--------------Results---------");
        System.out.print("Score = " + count + '/' + 10);
    }
}
