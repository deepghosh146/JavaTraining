package Day5;

import java.util.Arrays;

public class CharcterSort {
    public static void main(String[] args) {
        Character[] chars = {'f', 'k', 'a', 'd', 'u'};
        Arrays.sort(chars,(a,b)-> (b - a) );
        System.out.println(Arrays.toString(chars));
    }
}
