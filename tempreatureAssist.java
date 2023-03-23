import java.util.Scanner;

public class tempreatureAssist {
    public static void main(String[] args) {
        final double maximum_tempreature = 102.5;
        double tempreature;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the material tempreature: ");
            tempreature = input.nextDouble();

            while (tempreature > maximum_tempreature) {
                System.out.println("The tempreature is too high");
                System.out.println("Turn down the thermostat, wait for 5 minutes and check again");
                System.out.print("Enter the material tempreature: ");
                tempreature = input.nextDouble();
            }
            System.out.println("The tempreature is fine.\ncheck it again after 15 minutes");
        
        }


        
    }
    
}
