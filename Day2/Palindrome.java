package Day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.next();

        int l = 0, r = word.length() - 1;
        boolean isPalindeome = true;
        while (l < r) {
            if(word.charAt(l) != word.charAt(r)){
                isPalindeome = false;
                System.out.println(word + "is not palindrome");
                break;
            }
            l++;
            r--;
        }
        if(isPalindeome){
            System.out.println(word + " is a Palindrome");
        }
        input.close();
    }
}
