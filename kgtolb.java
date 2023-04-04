public class kgtolb {
    //Question 5.2
    public static void main(String[] args) {
        for (int i = 1; i <200; i+=2){
            if (i == 1){
                System.out.print("miles     kilometers");
                System.out.println();
            }
            for (int j = 1; j <=2;j++){
                if(j == 1){
                    System.out.print(i);
                } else {
                    System.out.printf("%15.2f",(float)(i*2.2));
                }
            }
            System.out.println();
        }
    }    
}

