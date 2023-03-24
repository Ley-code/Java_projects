public class SquaresTable {
  public static void main(String[] args) {
      int numRows = 5;

      for (int i = 1; i <= numRows; i++) {

          // Calculate the squares for this row
          int square1 = i * i;
          int square2 = square1 * square1;

          System.out.println(i + "\t" + square1 + "\t" + square2);
      }
  }
}