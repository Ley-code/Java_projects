import java.text.NumberFormat;

import java.util.Scanner;

public class Mortgage_Calculator{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int principal;
            while(true){
                System.out.print("Principal: ");
                principal = scanner.nextInt();
                if (principal >=1000 && principal <=500_000)
                    break;
                System.out.println("Enter a number between 1k and 0.5M");               
            }
            float annual_rate;
            float monthly_Interest;
            while(true){
                System.out.print("annual rate: ");
                annual_rate = scanner.nextFloat();
                if (annual_rate > 0 && annual_rate <=30){
                    monthly_Interest = (float)((annual_rate)/1200); 
             // dividing by 100 since it is a percent and dividing it by 12 number of months in a year
                    break;
                }
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
            float period;
            float monthlyPayments;
            
            while(true){
                System.out.print("period(years): ");
                period = scanner.nextInt();
                if(period > 0 && period <=30){
                    monthlyPayments = period * 12;
                    break;
                }
                System.out.println("Enter a value between 1 and 30");
            } 
            double numerator = (monthly_Interest *(Math.pow((1 + annual_rate), (monthlyPayments)))); // part of the formula
            double denominator = (Math.pow((1 + annual_rate), ((monthlyPayments) - 1)));
            double result = (principal * (numerator/denominator)); 
            
            String mortgage = NumberFormat.getCurrencyInstance().format(result); // changing it in to a currency format under number format class
            System.out.println("mortgage: " + mortgage);
        }
    }
}
