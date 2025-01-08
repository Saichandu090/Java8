package optionalclass;

import java.util.Optional;

public class IsEmpty
{
    public static Optional<String > get(String name)
    {
        if(name.isEmpty())
            return Optional.empty();
        return Optional.of(name);
    }

    public static void main(String[] args) {

        System.out.println(get("Sai Chandu"));

        System.out.println(get(""));
    }
}
