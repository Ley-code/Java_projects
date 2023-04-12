package OOP;


public class Food {
    String name;
    int quantity;
    float price;
    int cash;
    int money = 0;


    Food(String name, int quantity, float price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    void eat(){
        System.out.println("you are eating a "+ this.name);
    }
    void buy(){
        if ((this.price)*(this.quantity) > money){
            System.out.println("you have to pay " + (this.price)*(this.quantity) + "$ first");
        } else if ((this.price)*(this.quantity) <= money) {
            System.out.println("you have bought the " + (this.name));
            money-=(this.price)*(this.quantity);
        }
    
    }
    void getcash(int cash){
        money += cash;
        System.out.println("you have " + cash + "$ in your hand");
    }
    void moneyleft(){
        System.out.println("Remaining balance = " + money);
    }void totalprice(){
        System.out.println((this.price)*(this.quantity));
    }
}

