public class series {
    //Question 5.23
    public static void main(String[] args) {
        
        int n = 5000;
        double sum = 0.0;
        double sum2 = 0.0;
        for(int i = 1; i<=2;i++){
            sum = sum + (double)(1/i);
        }
        System.out.println(sum);
        for (int i = 5000; i>=1;i--){
            sum2 = sum2 + (double)(1/i);
        }
        System.out.println(sum2);

    }
}
