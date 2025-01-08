package stramapi;

import java.util.List;

public class MaxString
{
    public static void main(String[] args) {

        List<String> names = List.of("Sai Chandu","Jenisha Lamgade","Vamsi","Chandini","Vishnu","Sathhesh","John cena");

        String rs= names.stream()
                .max((name1,name2)->name1.length()-name2.length())
                .toString();

        System.out.println(rs);
    }
}
