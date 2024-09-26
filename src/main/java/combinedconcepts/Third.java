package combinedconcepts;

import java.util.List;

public class Third
{
    public static void main(String[] args) {

        List<String> list=List.of("Sai","Chand","Jenishna","Vishnu","Chandu","Jashendra","Rahilraut");

        List<String> rs=list.stream()
                .filter(a->a.length()>5)
                .toList();

        rs.forEach(System.out::println);
    }
}
