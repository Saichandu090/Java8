package functionalinterfaces;

@FunctionalInterface
public interface StringLength
{
    int length(String s);
}


class StringLengthTest
{

    public static void main(String[] args) {

        StringLength s1=s->s.length();
        String q1="Sai Chandu";
        System.out.println("Size of "+q1+" is : "+s1.length(q1));

        String q2="Jenisha";
        System.out.println("Size of "+q2+" is : "+s1.length(q2));

        String q3="Vamsi";
        System.out.println("Size of "+q3+" is : "+s1.length(q3));


    }
}