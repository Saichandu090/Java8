package lambdaexpressions;

import functionalinterfaces.IntOperation;

import java.util.List;

public class Third
{
    public static void main(String[] args) {

        List<Integer> list= List.of(34,21,3,6,66,98,345,67,987,1234,234,678,54,0);

        int max=list.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println(max);

        int min=list.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println(min);
    }
}
