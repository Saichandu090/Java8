package optionalclass;

import java.util.List;
import java.util.Optional;

public class Third
{
    public static void get(Optional<List<String>> o)
    {
        o.stream()
                .filter(t->!t.isEmpty())
                .toList()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {


    }
}
