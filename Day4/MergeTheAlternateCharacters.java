package Day4;

import java.util.Scanner;

public class MergeTheAlternateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string 1: ");
        String str1 = input.nextLine();
        char[] chars1 = str1.toCharArray();
        System.out.print("Enter a string 2: ");
        String str2 = input.nextLine();
        char[] chars2 = str2.toCharArray();

        StringBuilder ans = new StringBuilder();
        int len1 = chars1.length;
        int len2 = chars2.length;
        if(len1 == len2){
            for(int i = 0; i < len1; i++) {
                ans.append(str1.charAt(i) + str2.charAt(i));
            }
        }
        else if(len1 > len2){
            for(int i = 0; i < len2; i++){
                ans.append(str1.charAt(i) + str2.charAt(i));
            }
            for(int i = len2; i < len1; i++){
                ans.append(str1.charAt(i));
            }
        }
        else{
            for(int i = 0; i < len1; i++){
                ans.append(str1.charAt(i) + str2.charAt(i));
            }
            for(int i = len1; i < len2; i++){
                ans.append(str2.charAt(i));
            }
        }
        System.out.println("Result: "+ans);
    }
}
