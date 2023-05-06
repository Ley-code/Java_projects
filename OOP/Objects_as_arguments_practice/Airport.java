package OOP;

public class Airport {
    void dock(Plane whatever){
        System.out.println(whatever.name + " is parked");
    }
    void maintainance(Plane dontknow){
        System.out.println(dontknow.name + " is being maintained");
    }
}
