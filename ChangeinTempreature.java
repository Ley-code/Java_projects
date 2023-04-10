package github;

import java.util.Scanner;

public class ChangeinTempreature{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Unit of tempreature: ");
        String temp = kb.nextLine();
        if (temp.equalsIgnoreCase("c")){
            System.out.print("want to know the change in: ");
            String variable =kb.nextLine();
            if(variable.equalsIgnoreCase("f") || variable.equalsIgnoreCase("r")){
                System.out.print("Change in tempreature in C: ");
                float Ccelsius = kb.nextFloat();
                float Cfahrenheit = (float) (1.8*Ccelsius);
                System.out.print("Change in Fahrenheit or Rankine is: " + Cfahrenheit);
            } else if (variable.equalsIgnoreCase("k")){
                System.out.print("it is the same as change in celsius.");
            }
        } else if (temp.equalsIgnoreCase("f")){
            System.out.print("want to know the change in: ");
            String variable =kb.nextLine();
            if (variable.equalsIgnoreCase("c") || variable.equalsIgnoreCase("k")){
                System.out.print("Change in tempreature in F: ");
            
                float Cfahrenheit = kb.nextFloat();
                float Ccelsius = (float) ((5.0/9.0)*((Cfahrenheit+32) - 32));
                System.out.print("Change in Celsius or Kelvin is: " + Ccelsius);
            }else if (variable.equalsIgnoreCase("r")){
                System.out.println("it is the same as change in fahrenheit.");
            }
            
        } kb.close();
        

    }
}