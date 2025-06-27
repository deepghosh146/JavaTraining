package Day2;

import java.util.Scanner;

public class LongestNonPalindromicSubstring {
    public static boolean isPalindrome(String word) {
        int l = 0, r = word.length() - 1;
        while (l < r) {
            if(word.charAt(l) != word.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.next();
        input.close();
        int i = 0, j = word.length();
        if(isPalindrome(word)){
            i++;
            word = word.substring(i,j+1);
        }
        else{

        }
    }
}
