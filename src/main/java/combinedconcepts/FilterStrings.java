package combinedconcepts;

import java.util.List;

public class FilterStrings
{
    public static void main(String[] args) {

        List<String> names=List.of("Sai","Chand","Jenishna","Vishnu","Chandu","Jashendra","Rahilraut");

        List<String> rs=names.stream()
                .filter(name->name.length()>5)
                .toList();

        rs.forEach(System.out::println);
    }
}
