
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Set<String> set = new LinkedHashSet<>();
        Set Mirror = new MirrorSet(set);
        set.add("Hello world!");
        set.add("88884444");


        for(var element : set)
        {
            System.out.println(element + " ");
        }

        Mirror.add("Goodbye, cruel world!");

        for(var element : Mirror)
        {
            System.out.println(element + " ");
        }
    }
}