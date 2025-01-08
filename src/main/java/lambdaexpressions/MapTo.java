package lambdaexpressions;

import java.util.List;

public class MapTo
{
    public static void main(String[] args) {

        List<Integer> list= List.of(2,3,4,5,6,7,8,9);

        list=list.stream()
                .map(n->n*n)
                .toList();

        list.forEach(System.out::println);
    }
}
