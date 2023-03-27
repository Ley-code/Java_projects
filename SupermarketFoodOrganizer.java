import javax.swing.JOptionPane;

public class SupermarketFoodOrganizer {
    public static void main(String[] args) {
        int Foodcontainer; //capacity of food containers
        int Foods; //number of foods
        int Numcontainers; //number of food containers
        int MaximumFood;
        String input;
    
        input = JOptionPane.showInputDialog("Number of FoodContainers: ");
        Numcontainers = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Maximum Capacity of Foodcontainer: ");
        Foodcontainer = Integer.parseInt(input);


        while(Foodcontainer < 0){
            input = JOptionPane.showInputDialog("Maximum Capacity of Foodcontainer cannot be lessthan 0 Enter another number: ");
            Foodcontainer = Integer.parseInt(input);
        }
        input = JOptionPane.showInputDialog("Number of foods: ");
        Foods = Integer.parseInt(input);

        while(Foods < 0){
            input = JOptionPane.showInputDialog("Number of foods can not be lessthan 0 Enter another number: ");
            Foods = Integer.parseInt(input);
        }
        
        MaximumFood = (Foodcontainer * Numcontainers);
        if (MaximumFood < Foods){
            JOptionPane.showMessageDialog(null, "There will be " + (Foods - MaximumFood) + " foods leftover.");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "There will be " + (MaximumFood - Foods) + " left spaces for foods.");
            System.exit(0);
        }



    }
}
