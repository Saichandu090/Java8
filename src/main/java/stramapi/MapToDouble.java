package stramapi;

import java.util.List;

public class MapToDouble
{
    public static void main(String[] args) {

        List<Double> numbers =List.of(2.3,5.2,8.9,5.6,2.1,7.3,8.4,9.4);

        double rs= numbers.stream()
                .mapToDouble(number->number)
                .average()
                .getAsDouble();

        System.out.println(rs);
    }
}
