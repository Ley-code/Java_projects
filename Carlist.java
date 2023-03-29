public class Carlist {
    public static void main(String[] args) {
        String cars [][] =  {
                            {"ford","mustang","ferrari","dodge"},
                            {"nissan", "audi", "lambo", "bentley"},
                            {"honda", "atoz", "toyota", "astonmartin","jaguar"}
                            };
        for(int i = 0; i < cars.length; i ++){
            for (int j = 0; j < cars[i].length; j ++){
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
