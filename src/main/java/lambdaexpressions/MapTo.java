package lambdaexpressions;

import java.util.List;

public class MapTo
{
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,3,4,5,6,7,8,9);

        numbers = numbers.stream()
                .map(num->num*num)
                .toList();

        numbers.forEach(System.out::println);
    }
}
