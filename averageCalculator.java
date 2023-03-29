import java.util.Scanner;

public class averageCalculator{
    public static void main(String[] args) {
        float individualSubjectResult[] = new float[3];
        float sum = 0;
        String subjects[] = {"maths: ", "physics: ", "english: "};
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < individualSubjectResult.length; i++){
            System.out.print(subjects[i]);
            individualSubjectResult[i] = kb.nextFloat();   
        }kb.close();
        for ( int j = 0; j < individualSubjectResult.length; j++){
            sum += individualSubjectResult[j];
        }
        System.out.println("Your average is " + (sum/individualSubjectResult.length));
        System.out.println("Your GPA is " + (sum/individualSubjectResult.length)/(25.0f));
        

    } 
}