import java.text.NumberFormat;

import java.util.Scanner;

public class Welcome{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //initializing the "input method"
        
        System.out.print("Principal: ");
        float principal = scanner.nextInt();
        
        System.out.print("annual rate: ");
        float annual_rate = scanner.nextFloat();
        
        System.out.print("period(years): ");
        int period = scanner.nextInt();
        
        double rate = ((annual_rate)/1200); // dividing by 100 since it is a percent and dividing it by 12 number of months in a year
        double numerator = rate *(Math.pow((1 + annual_rate), (period * 12))); // part of the formula
        double denominator = Math.pow((1 + annual_rate), (period * 12)) - 1;
        double result = principal * (numerator/denominator); 
        
        String mortgage = NumberFormat.getCurrencyInstance().format(result); // changing it in to a currency format under number format class
        System.out.println("mortgage: " + mortgage);
    
    }

}