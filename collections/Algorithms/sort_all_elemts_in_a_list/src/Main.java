import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(3);

        System.out.println("unsorted list: " + list );

        Collections.sort(list);


        System.out.println("sorted list : " + list);

        //to search for a element in that list

        System.out.println("Binary search result :" + Collections.binarySearch(list,4));

        // number of times we have an elemnt in the list
        System.out.println("frequency of 4 :" + Collections.frequency(list,4));

        System.out.println("max elemt in the list :" + Collections.max(list));
        System.out.println("min elemt in the list :" + Collections.min(list));

        //shuffle list in random order
        Collections.shuffle(list);
        System.out.println("shuffled list :" + list  );

        // swappig elemts in a list

        Collections.swap(list,2,5);
        System.out.println("elemts 2 and 5 swapped : " + list);

        // replace elemts with the same value
        Collections.fill(list,3);
        System.out.println("List filled with 3" + list);
    }
}