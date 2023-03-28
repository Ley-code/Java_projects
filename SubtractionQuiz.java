import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int correctguesses = 0;
        
        int guess;
        int count = 0;
        Scanner kb = new Scanner(System.in);
        
        do {
            int num1 = (int)(Math.random() * 101);
            int num2 = (int)(Math.random() * 101);
            System.out.print(num1 + " - " + num2 + " = ");
            guess = kb.nextInt();
            if (guess == num1 - num2){
                correctguesses += 1;
                System.out.println("its correct");
            } else {
                System.out.println("the correct answer is " + (num1 - num2) );
            } count ++;
        } while( count < 4 );
        kb.close();
        
        System.out.println("result: " + (correctguesses) +"/" + (count));
        if(correctguesses == count);
            System.out.println("perfect score!!!! you have some future");
    }   
}