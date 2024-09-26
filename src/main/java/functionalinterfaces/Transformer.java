package functionalinterfaces;

import java.io.StringReader;

@FunctionalInterface
public interface Transformer
{
    String transform(String input);
}


class TransformerTest
{
    public static void main(String[] args) {

        Transformer lowerCase=s->s.toLowerCase();
        Transformer upperCase=s->s.toUpperCase();

        String s1="Sai Chandu";
        String s2="Jenisha";
        String s3="Vishnu";

        System.out.println(lowerCase.transform(s1));
        System.out.println(upperCase.transform(s1));

        System.out.println(lowerCase.transform(s2));
        System.out.println(upperCase.transform(s2));

        System.out.println(lowerCase.transform(s3));
        System.out.println(upperCase.transform(s3));

    }
}