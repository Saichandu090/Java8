package stramapi;

import java.util.Arrays;

public class FilterInteger
{
    public static void main(String[] args) {

        int[] ar={1,3,4,2,6,78,34,23,98,67,12,45,68};

        int even= Arrays.stream(ar)
                .boxed()
                .mapToInt(a->a%2==0?a:0)
                .sum();

        System.out.println("Sum of even : "+even);
    }
}
