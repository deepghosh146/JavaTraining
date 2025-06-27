package Day2;

import java.util.Scanner;

public class Rotatebykindex {
    public static void reverse(char[] arr,int start,int end){
        while (start < end) {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = input.nextLine();
        System.out.print("Enter the place: ");
        int place = input.nextInt();
        input.close();

        char[] chars = word.toCharArray();
        int n = chars.length;
        reverse(chars,0,place-1);
        reverse(chars,place,n-1);
        reverse(chars,0,n-1);
        System.out.println("The rotated word is: "+String.valueOf(chars));
    }
}
