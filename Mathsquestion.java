import java.util.*;

public class Mathsquestion 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
            
            while (true)
            {
                int number1 = (int)(Math.random() * 20);
                int number2 = (int)(Math.random() * 20);
                System.out.print("What is " + number1 + " + " + number2 +": " );
                int guess = kb.nextInt();
                while (guess != (number1 + number2))
                {
                    System.out.println("Wrong try again!");
                    System.out.print("What is " + number1 + " + " + number2 +": ");
                    guess = kb.nextInt();
                }
                System.out.println("correct!");
                System.out.println("Do you want to play again? ");
                System.out.print("Enter capital 'Y' or 'N' :");
                kb.nextLine();
                String tryagain = kb.nextLine();
        
                if (tryagain.equals("N"))
                {
                    System.out.println("BYEEEEEEEEE");
                    break;
                } 
                else if(tryagain.equals("Y"))
                {
                    continue;
                }
                else 
                {
                    System.out.println("Incorrect Input.");
                    System.out.println("Exiting Program.");
                    break;
                }
            }
            kb.close();
        }   
}  

