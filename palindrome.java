import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a word to be checked: ");
        String word = kb.nextLine();

        int first = 0; //index of the first letter
        int last = word.length() - 1; //index of the last letter

        boolean is_palindrome = true;

        while(first < last){
            if (word.charAt(first)!= word.charAt(last)){
                is_palindrome = false;   
            }
            first++;
            last--;
        
        }
        System.out.println(is_palindrome);
        kb.close();

    }
}
