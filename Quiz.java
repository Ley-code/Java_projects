package github;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String choice;
        String question;

        System.out.print("Number of Questions: ");
        int numque = kb.nextInt();
        System.out.print("Number of choices each question have: ");
        int numchoice = kb.nextInt();
        String[] choicename = new String[numchoice];
        String[] Answers = new String[numque];
        
        String[] Questions = new String[numque];
        String[][] choices = new String[numque][numchoice];
//------------------------------------------------------------------------
        for(int i = 0; i < numque; i++){
            System.out.print("Question no " + (i+1) + ":");
            question = kb.nextLine();
            question = kb.nextLine();
            Questions[i] = question;
            for(int j = 0; j < numchoice; j++){                      //receives question from the user
                System.out.printf("Choice %d: ", j+1);
                choice = kb.nextLine();
                choices[i][j] = choice;
            }
            System.out.print("Answer of this question: ");
            String answer = kb.nextLine();
            Answers[i] = answer;
        }
//---------------------------------------------------------------------------
        for(int i = 0; i<numque;i++){
            for(int j = 0; j<numchoice;j++){
                System.out.println(Questions[i]);
            }
        }
//---------------------------------------------------------------------------
        /*System.out.print("Do you want to start the quiz(y/n): ");
        String response = kb.nextLine();
        while(response.equals("y"))
            System.out.println("-------------------------------------Quiztime---------------------------");
            for(int i = 0; i<numque; i++){
                System.out.printf("Question no %d: "+ Questions[i] ,i+1 );    
            }
            */
    }
    
}
