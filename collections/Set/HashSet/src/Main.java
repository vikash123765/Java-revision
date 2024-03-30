import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {
        Set<Integer> set =  new HashSet<>();

       // we can not add 2 identical elemt to a class only one of them will be sav ed
        set.add(3);
        set.add(5);
        set.add(3);

        System.out.println(set);

        //assures the insertion order of the elemtts
        Set<Integer> linkedHashSet  = new LinkedHashSet<>();
        // to ensure the uiniqeness proprety. elemts are stored in their natyural ordering
        Set<Integer> treeSet = new TreeSet<>();
    }
}