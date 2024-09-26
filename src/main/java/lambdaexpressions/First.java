package lambdaexpressions;

import java.util.List;

public class First
{
    public static void main(String[] args)
    {
        List<Integer> list = List.of(1, 4, 7, 4, 2, 3, 6, 3, 7, 3, 1, 78, 56, 34, 99);
        list=list.stream()
                .sorted((a,b)->b-a)
                .toList();

        list.forEach(System.out::println);

    }
}
