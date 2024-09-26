package stramapi;

import java.util.List;

public class Second
{
    public static void main(String[] args) {

        List<String> list= List.of("Sai Chandu","Jenisha Lamgade","Vamsi","Chandini","Vishnu","Sathhesh","John cena");

        String rs=list.stream()
                .max((s1,s2)->s1.length()-s2.length())
                .toString();

        System.out.println(rs);
    }
}
