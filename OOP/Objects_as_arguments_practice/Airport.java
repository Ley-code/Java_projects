package OOP;

public class Airport {
    void dock(Plane whatever){  //this takes the plane object as an argument to the method dock ... the name can be whatever :)
        System.out.println(whatever.name + " is parked");
    }
    void maintainance(Plane dontknow){ // same as the above
        System.out.println(dontknow.name + " is being maintained");
    }
}
