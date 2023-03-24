public class SquareTable {
    public static void main(String[] args) {
      int numRows = 5; // Number of rows in the table
      int numCols = 6; // Number of columns in the table
  
      // Loop through each row
      for (int i = 1; i <= numRows; i++) {
  
        // Print the row header
        System.out.print(i + " | ");
  
        // Loop through each column
        for (int j = 1, square = i; j <= numCols; j++, square *= i) {
          System.out.print(square + "\t");
        }
  
        // Move to the next row
        System.out.println();
      }
    }
  }