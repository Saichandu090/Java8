package combinedconcepts;

import java.util.List;

public class Filter
{
    public static void main(String[] args) {

        List<Integer> list=List.of(1,2,3,4,5,6,7);

        int rs=list.stream()
                .filter(a->a%2==1)
                .reduce((a,b)->a*b)
                .get();

        System.out.println(rs);
    }
}
