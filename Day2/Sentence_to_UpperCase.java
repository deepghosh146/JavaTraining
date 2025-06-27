package Day2;

import java.util.Scanner;

public class Sentence_to_UpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine().toLowerCase();
        char chars[] = sentence.toCharArray();

        if(chars.length > 0){
            chars[0] = Character.toUpperCase(chars[0]);
        }
        for(int i = 0; i < chars.length - 1; i++){
            if(chars[i] == ' '){
                chars[i+1] = Character.toUpperCase(chars[i+1]);
            }
            else{
                chars[i+1] = Character.toLowerCase(chars[i+1]);
            }
        }
        System.out.println(String.valueOf(chars));
        input.close();
    }
}
