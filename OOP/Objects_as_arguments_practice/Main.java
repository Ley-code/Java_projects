package OOP;

public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane("boeing 777","Addis Ababa" , "Mexico");  //creating an instance of the plane class
        Airport bole_international_airport = new Airport();               //creating an instance of the airport class
        
        plane1.fly(); 
        
        bole_international_airport.dock(plane1); // this will take plane1 as an argument and passes it to the dock function(method) and whatever is in the dock method is called
        bole_international_airport.maintainance(plane1); //same as the above
    } 
}
