package lambdaexpressions;

import java.util.List;
import java.util.stream.Collectors;

public class CollectStream
{
    public static void main(String[] args) {

        List<String > list=List.of("Sai","Chandu","Jenny Jenishna","Chandini","Vamsi","Vishnu");

        String rs=list.stream()
                .collect(Collectors.joining(","))
                .toString();

        System.out.println(rs);
    }
}
