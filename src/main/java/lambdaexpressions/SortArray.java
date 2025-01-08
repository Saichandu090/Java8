package lambdaexpressions;

import java.util.List;

public class SortArray
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1, 4, 7, 4, 2, 3, 6, 3, 7, 3, 1, 78, 56, 34, 99);
        numbers = numbers.stream()
                .sorted((num1,num2)->num1-num2)
                .toList();

        numbers.forEach(System.out::println);

    }
}
