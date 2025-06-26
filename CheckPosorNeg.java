package Day1;

import java.util.Scanner;

public class CheckPosorNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Number is negative");
        }
        else if (number > 0) {
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is zero, neither positive nor negative");
        }
        input.close();
    }
}
