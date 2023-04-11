package OOP;

public class Food {
    public static void main(String[] args) {
        Food food1 = new Food("burger",2,50);
        Food food2 = new Food("pizza", 3, 150);
        System.out.println(food1.name);
        food2.buy();
    }
    String name;
    int quantity;
    float price;
    Food(String name, int quantity, float price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    void eat(){
        System.out.println("you are eating a "+ this.name);
    }
    void buy(){
        System.out.println("you have to pay " + (this.price)*(this.quantity) + "$ first");
    }
}
