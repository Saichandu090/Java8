package lambdaexpressions;

import java.util.List;

public class FilterStrings
{
    public static void main(String[] args) {

        List<String> names= List.of("","","sai","jenny","Rahil","");

        names=names.stream()
                .filter(name->!name.isEmpty())
                .toList();

        names.forEach(System.out::println);
    }
}
