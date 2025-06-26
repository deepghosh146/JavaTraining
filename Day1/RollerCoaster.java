package Day1;

import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height in cm: ");
        int height = input.nextInt();

        if(height > 120) {
            System.out.println("Can Ride RollerCoaster");
            System.out.print("Enter the age: ");
            int bill;
            int age = input.nextInt();
            if(age > 18){
                bill = 12;
            }
            else if(age >= 12){
                bill = 7;
            }
            else{
                bill = 5;
            }
            System.out.print("Want photo? (yes/no) : ");
            String choose = input.next();
            if(choose.equals("yes")){
                bill += 3;
            }
            System.out.println("Total bill: $" + bill);
        }
        else{
            System.out.println("Can't Ride RollerCoaster");
        }
        input.close();
    }
}
