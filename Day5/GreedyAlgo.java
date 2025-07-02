package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GreedyAlgo {
    public static void main(String[] args) {
        Integer[] cash = {1,2,5,10,20, 50, 100, 200, 500, 2000};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter change to get: ");
        int change = sc.nextInt();

        Arrays.sort(cash,(a,b) -> b - a);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < cash.length; i++){
            while(change >= cash[i]){
                change -= cash[i];
                ans.add(cash[i]);
            }
        }
        System.out.println(ans);
    }
}
