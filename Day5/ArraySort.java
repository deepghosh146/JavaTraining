package Day5;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Integer[] numbers = {8, 5, 4, 7, 9, 1,3};
        Arrays.sort(numbers,(a,b)->Integer.compare(a,b));
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers,(a,b) -> (b - a) );
        System.out.println(Arrays.toString(numbers));
    }
}
