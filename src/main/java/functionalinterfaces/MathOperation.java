package functionalinterfaces;

@FunctionalInterface
public interface MathOperation
{
    double calculate(double a,double b);
}

class MathOperationTest
{
    public static void main(String[] args) {

        MathOperation mod=(a,b)->a%b;
        MathOperation pow=(a,b)->Math.pow(a,b);

        System.out.println("Modulus : "+mod.calculate(89,789));
        System.out.println("Power : "+pow.calculate(4,5));
        System.out.println("Power : "+pow.calculate(5,3));
    }
}
