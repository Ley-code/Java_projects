public class kgtolbandlbtokg {
    //Question 5.5
    public static void main(String[] args) {
        int k = 20;
        for (int i = 1; i <11; i++){
            if (i == 1){
                System.out.print("Miles     Kilometers   |    Kilometers    Miles");
                System.out.println();
            }
            for (int j = 1; j <=4;j++){
                if(j == 1){
                    System.out.print(i);
                } else if (j == 2) {
                    System.out.printf("%15.2f", (float)(i*1.609));
                } else if ( j == 3) {
                    System.out.printf("%8s","|");
                    System.out.printf("%10d", k);
                    k += 5;
                } else if (j==4){
                    System.out.printf("%15.2f", (float)((k-5)/1.609));
                }
            }
            System.out.println();
        }
    }
    
}
