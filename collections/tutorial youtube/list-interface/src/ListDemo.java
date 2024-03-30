import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","a");
         //list.set(0,"g");
         //list.remove(1);

        System.out.println(list.subList(0,2));

        //System.out.println(list.lastIndexOf("a"));
       // System.out.println(list.indexOf("a"));
       // System.out.println(list.get(0));
       /* list.add("a");
        list.add("b");
        list.add("c");*/
       // list.add(0,"!"); // we cant do this with collection interface because it does not support indexing
        //System.out.println(list);


    }
}
