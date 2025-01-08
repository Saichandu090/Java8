package stramapi;

import java.util.List;

public class FilterString
{
    public static void main(String[] args) {

        List<String> list= List.of("Sai Chandu","Jenisha Lamgade","James","Chandini","Vishnu","Sathhesh","John cena");

        long rs=list.stream()
                .filter((s)->s.startsWith("J"))
                .count();

        System.out.println(rs);
    }
}
