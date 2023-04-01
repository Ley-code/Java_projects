import java.util.Scanner;

public class AverageIncludingNegative {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int positiveCount = 0;
            int negativeCount = 0;
            double sum = 0.0;

            System.out.print("Enter an integer the input Ends if it is 0: ");
            int num = kb.nextInt();   
            
            while(num != 0){ //adds and averages the number that are entered before 0.
                            
                if (num > 0){
                    positiveCount++;
                } else {
                    negativeCount++;
                }
                sum += num;
                num = kb.nextInt();
            }
            if((positiveCount+negativeCount) == 0){ //checks if there are numbers entered before 0
                System.out.println("no numbers are entered except 0.");
            }
            double average = (sum/(positiveCount+negativeCount));
            System.out.println("The number of positives is: " + (positiveCount));
            System.out.println("The number of negatives is: " + (negativeCount));
            System.out.println("The total is: " + sum);
            System.out.println("The average is: " + average);
        }
    }   Exception kb;
}
