package OOP;

import java.text.NumberFormat;

public class Car {
    String model = "Tesla";
    int year = 2015;
    String price =NumberFormat.getCurrencyInstance().format(100000.00);
    void drive(){
        System.out.println("the car is driving");
    }
    void stop(){
        System.out.println("the car is stopping");
    }

    
}
