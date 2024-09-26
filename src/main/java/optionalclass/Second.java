package optionalclass;

import java.util.Optional;

public class Second
{
    public static void get(Optional<String > o)
    {
        o.ifPresentOrElse(a-> System.out.println(a.toUpperCase()),()-> System.out.println("No Value"));
    }

    public static void main(String[] args) {

        get(Optional.of(""));
        get(Optional.of("Sai Chandu"));
        get(Optional.of("Jenny"));
    }
}
