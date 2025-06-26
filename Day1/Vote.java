package Day1;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age in years: ");
        int age = input.nextInt();

        if(age >= 18) {
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }
        input.close();
    }
}
