package Day1;

import java.util.Scanner;

public class WierdProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        if ((number >= 6 && number < 20) || number % 2 != 0) {
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        input.close();
    }
}
