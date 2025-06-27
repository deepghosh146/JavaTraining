package Day2;

import java.util.Scanner;

public class RotationOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string1: ");
        String word1 = input.next();
        System.out.print("Enter a string1: ");
        String word2 = input.next();

        String rotatedString = word1 + word1;
        if(rotatedString.contains(word2)){
            System.out.println("Rotation found!");
        }
        else{
            System.out.println("Rotation Not found!");
        }
    }
}
