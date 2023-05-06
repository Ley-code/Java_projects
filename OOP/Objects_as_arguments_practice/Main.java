package OOP;

public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane("boeing 777","Addis Ababa" , "Mexico");
        
        plane1.fly();
        Airport bole_international_airport = new Airport();
        bole_international_airport.dock(plane1);
        bole_international_airport.maintainance(plane1);
    }
}