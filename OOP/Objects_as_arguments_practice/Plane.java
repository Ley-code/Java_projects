package OOP;

public class Plane {
    String name,currcurrentposition,finaldestination;
    
    Plane(String name, String currentposition, String finaldestination){
        this.name = name;
        this.currcurrentposition =currentposition;
        this.finaldestination = finaldestination;
    }
    void fly(){
        System.out.println(this.name + " is flying from " + this.currcurrentposition + " to " + this.finaldestination);
    }
}
