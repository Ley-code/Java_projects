//w3resource array question answers.
import java.util.Arrays;
import java.util.Scanner;

public class Arraypractice {
    public static void main(String[] args) {
        int[][] numberlist = new int[4][3];
        for (int i = 0; i < numberlist.length; i++){
            for(int j = 0; j < numberlist[i].length;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        //Question = Write a java program to sort a numeric array and a string array.
        int[] numbers = {2,9,4,8,1,5,6,3,2};
        String[] words = {"Chala","Abebe", "kebede", "Calcium","Bitches"};
        
        Arrays.sort(numbers);
        System.out.printf("numeric array: %s" ,Arrays.toString(numbers));
        System.out.println();
        Arrays.sort(words);
        System.out.printf("sorted word array: %s", Arrays.toString(words));
        System.out.println();

        //Question = Write a java program to sum values of an array.
        double sum = 0.0;
        for (int i = 0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.printf("Sum of numeric array: %.2f", sum);
        System.out.println();

        //Question = Write a java program to print the following grid.
        int[][] list = new int[10][10];
        for (int i = 0; i< list.length;i++){
            for (int j = 0; j < list[i].length;j++){
                System.out.print(" - ");
            }
            System.out.println();
        }
        System.out.println();

        //Question = write a java program to calculate the average value of array elements.
        System.out.printf("average of numeric array: %.2f",(sum / numbers.length));
        System.out.println();

        //Question = write a java program to find the index of an array element.
        Scanner kb = new Scanner(System.in);
        System.out.print("Want to find the indexof: ");
        int number = kb.nextInt();
        boolean exists = true;
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i] == number){
                System.out.printf("the index of %d is: %d ",number,i);
                break;
            } else {
                exists = false;
            }
        }
        if(exists == false){
            System.out.println("The number is not on the list");
        }

        //Question = write a java program to test if an array contains a specific value.
        boolean isthere = false;
        System.out.print("Specific value: ");
        number = kb.nextInt();
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i] == number){
                isthere = true;
            }
        }
        System.out.println(isthere);

            
        
        

    }
}
