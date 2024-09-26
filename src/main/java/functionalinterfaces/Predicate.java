package functionalinterfaces;

@FunctionalInterface
public interface Predicate<T>
{
    boolean test(String s,String subString);
}


class PredicateTest
{
    public static void main(String[] args) {

        Predicate<String> p1=(s1,s2)->s1.contains(s2);

        String s1="Sai Chandu";
        System.out.println(p1.test(s1,"Sai"));
        System.out.println(p1.test(s1,"sai"));
        System.out.println(p1.test(s1,"chandu"));
        System.out.println(p1.test(s1,"Chandu"));
    }
}