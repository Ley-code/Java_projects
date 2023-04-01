public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int num = 2; //the first number
        int count = 0; 
        final int MAX_PRIMES = 50; 
        final int PRIMES_PER_LINE = 10; 
        
        
        while(count < MAX_PRIMES){  
            boolean isPrime = true;
            for (int i = 2; i < (num); i++){  

                if (num % i == 0){     // checks whether the number is prime or not
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;     // if tis prime it increases the counter and prints the number
                System.out.print(num + " ");
                if (count % PRIMES_PER_LINE == 0){
                    System.out.println();
                }
            }
            num++;  
        }
    }
}
