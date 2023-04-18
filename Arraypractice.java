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
        
        //Question 1 = Write a java program to sort a numeric array and a string array.
        int[] numbers = {2,9,4,8,1,5,6,3,2};
        String[] words = {"Chala","Abebe", "kebede", "Calcium","Bitches"};
        
        Arrays.sort(numbers);
        System.out.printf("numeric array: %s" ,Arrays.toString(numbers));
        System.out.println();
        Arrays.sort(words);
        System.out.printf("sorted word array: %s", Arrays.toString(words));
        System.out.println();

        //Question 2 = Write a java program to sum values of an array.
        double sum = 0.0;
        for (int i = 0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.printf("Sum of numeric array: %.2f", sum);
        System.out.println();

        //Question 3 = Write a java program to print the following grid.
        int[][] list = new int[10][10];
        for (int i = 0; i< list.length;i++){
            for (int j = 0; j < list[i].length;j++){
                System.out.print(" - ");
            }
            System.out.println();
        }
        System.out.println();

        //Question 4 = write a java program to calculate the average value of array elements.
        System.out.printf("average of numeric array: %.2f",(sum / numbers.length));
        System.out.println();

        //Question 5 = write a java program to find the index of an array element.
        Scanner kb = new Scanner(System.in);
        System.out.print("Want to find the indexof: ");
        int number = kb.nextInt();
        boolean exists = false;
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i] == number){
                System.out.printf("the index of %d is: %d ",number,i);
                exists = true;
                break;
            } 
        }
        if(exists == false){
            System.out.println("The number is not on the list");
        }
        System.out.println();

        //Question 6 = write a java program to test if an array contains a specific value.
        boolean isthere = false;
        System.out.print("Specific value: ");
        number = kb.nextInt();
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i] == number){
                isthere = true;
            }
        }
        System.out.println(isthere);

        //Question 7 =  Write a Java program to remove a specific element from an array.
        System.out.print("index of the number to be removed: ");
        number = kb.nextInt();
        for (int i = number; i < numbers.length -1 ; i++){
            numbers[i] = numbers[i+1];
        }
        System.out.println(Arrays.toString(numbers));
        
        //Question 9 = Write a java program to insert an element (specific position) in to an array.
        System.out.print("Insert number: ");
        int value = kb.nextInt();
        System.out.print("Index postion: ");
        int index = kb.nextInt();
        
        for(int i = numbers.length-1; i > index;i--){
            numbers[i] = numbers[i-1];   
        }
        numbers[index] = value;
        System.out.println(Arrays.toString(numbers));
        kb.close();
    }
}
