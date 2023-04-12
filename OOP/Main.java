package OOP;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food("burger",2,50);
        
    
        food1.buy();               //this will check if you have enough money at hand by default you have no cash so 
                                   //it will display the required cash first

        food1.getcash(120);   //this will update your cash so if it is greater than the total price                           
        food1.buy();                //you will buy the food

        food1.moneyleft();           //this method will show ur remaining cash after buying
    }  
}

