package Day5;

import java.util.Arrays;

public class FruitSort {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Pear", "Strawberry", "Mango"};
        Arrays.sort(fruits,(a,b)->(b.length()- a.length()));
        System.out.println(Arrays.toString(fruits));
    }
}
