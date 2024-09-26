package functionalinterfaces;

@FunctionalInterface
public interface IntOperation
{
    int apply(int x,int y);
}


class IntOperationTest
{

    public static void main(String[] args)
    {

        IntOperation i=(a,b)->a+b;
        int addition=i.apply(5,6);
        System.out.println("Addition : "+addition);

        IntOperation i1=(a,b)->a-b;
        int sub=i1.apply(5,6);
        System.out.println("Substraction : "+sub);

        IntOperation i2=(a,b)->a*b;
        int mul=i2.apply(5,6);
        System.out.println("Multiplication : "+mul);

        IntOperation i3=(a,b)->a/b;
        int div=i3.apply(5,6);
        System.out.println("Division : "+div);

        IntOperation i4=(a,b)->a%b;
        int mod=i4.apply(5,6);
        System.out.println("Modulus : "+mod);

    }
}