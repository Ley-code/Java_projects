import java.util.Scanner;

public class CommonPrefix {
    public static void main(String[] args) {
    
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = kb.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = kb.nextLine();
        
        // Find length of shortest string
        int minLen = Math.min(string1.length(), string2.length());
        
        // Find largest common prefix
        String commonPrefix = "";
        for (int i = 0; i < minLen; i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                commonPrefix += string1.charAt(i);
            } else {
                break;
            }
        }
        
        // Display result
        if (commonPrefix.equals("")) {
            System.out.println(string1 + " and " + string2 + " have no common prefix");
        } else {
            System.out.println("The common prefix is " + commonPrefix);
        }
        kb.close();
    }
}