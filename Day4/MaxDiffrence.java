package Day4;

import java.util.Scanner;

public class MaxDiffrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        int maxi = Integer.MIN_VALUE, mini =Integer.MAX_VALUE;
        while (num > 0) {
            int lstdigit = num % 10;
            maxi = Math.max(maxi, lstdigit);
            mini = Math.min(mini, lstdigit);
            num = num / 10;
        }
        System.out.println("Result: "+ (maxi - mini));
    }
}
