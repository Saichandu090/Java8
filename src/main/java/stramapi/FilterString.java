package stramapi;

import java.util.List;

public class FilterString
{
    public static void main(String[] args) {

        List<String> strings = List.of("Sai Chandu","Jenisha Lamgade","James","Chandini","Vishnu","Sathhesh","John cena");

        long rs= strings.stream()
                .filter((string)->string.startsWith("J"))
                .count();

        System.out.println(rs);
    }
}
