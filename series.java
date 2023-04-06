public class series {
    //Question 5.23
    public static void main(String[] args) {
        double sum = 0.0;
        double sum2 = 0.0;
        for(double i = 1.0; i<=5000.0;i++){
            sum = sum + (double)(1.0/i);
        }
        System.out.println(sum);
        for (double i = 5000.0; i>=1.0;i--){
            sum2 = sum2 + (double)(1.0/i);
        }
        System.out.println(sum2);
    }
}
