package lambdaexpressions;

import java.util.List;
import java.util.stream.Collectors;

public class CollectStream
{
    public static void main(String[] args) {

        List<String > names=List.of("Sai","Chandu","Jenny Jenishna","Chandini","Vamsi","Vishnu");

        String rs=names.stream()
                .collect(Collectors.joining(","))
                .toString();

        System.out.println(rs);
    }
}
