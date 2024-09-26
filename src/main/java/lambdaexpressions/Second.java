package lambdaexpressions;

import java.util.List;

public class Second
{
    public static void main(String[] args) {

        List<String> list= List.of("","","sai","jenny","Rahil","");

        list=list.stream()
                .filter(s->!s.isEmpty())
                .toList();

        list.forEach(System.out::println);
    }
}
