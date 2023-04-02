import java.util.Scanner;

public class FibonacciSequence {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the length of the Fibonacci sequence: ");
      int n = kb.nextInt();

      int[] fib = new int[n]; // length of the arrayList
      fib[0] = 0;
      fib[1] = 1;

      for (int i = 2; i < n; i++) {
         fib[i] = fib[i-1] + fib[i-2];
      }

      System.out.print("Fibonacci sequence: ");
      for (int i = 0; i < n; i++) {
         System.out.print(fib[i] + " ");
      }
     kb.close();
   }
}