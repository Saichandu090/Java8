package combinedconcepts;

import java.util.List;

public class MaxElement
{
    public static void main(String[] args) {

        List<Integer> numbers= List.of(54,55,75,87,34,25,90,78,56,34,15,50);

        List<Integer> rs=numbers.stream()
                .filter(number->number%5==0)
                .max((a,b)->a-b)
                .stream().toList();

        rs.forEach(System.out::println);
    }
}

