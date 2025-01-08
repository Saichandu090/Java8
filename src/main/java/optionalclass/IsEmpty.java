package optionalclass;

import java.util.Optional;

public class IsEmpty
{
    public static Optional<String > get(String s)
    {
        if(s.isEmpty())
            return Optional.empty();
        return Optional.ofNullable(s);
    }

    public static void main(String[] args) {

        System.out.println(get("Sai Chandu"));

        System.out.println(get(""));
    }
}
