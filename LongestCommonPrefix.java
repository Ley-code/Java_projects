import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        String commonPrefix = findCommonPrefix(str1, str2);

        if (commonPrefix.length() == 0) {
            System.out.println("There is no common prefix.");
        } else {
            System.out.println("The common prefix is " + commonPrefix);
        }
        input.close();
    }

    public static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            }

            result.append(str1.charAt(i));
        }

        return result.toString();
    }
}