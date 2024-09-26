package stramapi;

import java.util.Date;
import java.util.List;

public class Fourth
{
    public static void main(String[] args) {

        List<Double> list=List.of(2.3,5.2,8.9,5.6,2.1,7.3,8.4,9.4);

        double rs=list.stream()
                .mapToDouble(s->s)
                .average()
                .getAsDouble();

        System.out.println(rs);
    }
}
