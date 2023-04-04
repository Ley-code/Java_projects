import java.util.Scanner;

public class repeatAdditions {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = 0;
        int correctAnswers = 0;
        long starttime = System.currentTimeMillis();
        while(count<5){
            int num1 = (int)((Math.random() * 14)+1);
            int num2 = (int)((Math.random() * 14)+1);
            
            System.out.print(num1 + " + " + num2 + " = ");
            int answer = kb.nextInt();
            if (answer == (num1 + num2)){
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("wrong :)");
            }count ++;

        }
        long endtime = System.currentTimeMillis();
        long quiztimesec = (endtime - starttime)/1000;
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.print("quiztime in sec: " + quiztimesec);
        kb.close();
    }

}
