import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_demo {

    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c");
        //collection.remove("a");
        //collection.clear();
        //ar containsA =  collection.contains("a"); // need to discuss var
      // var objectArray =   collection.toArray();  // convert collections to normal array
       //var stringArray =  collection.toArray(new String[0]); // convert object to string
     //  stringArray[0].toUpperCase();

        Collection<String> otherCollection = new ArrayList<>();
        otherCollection.addAll(collection);


    /*    collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
*/

        for (var item : collection)
           // System.out.println(collection.size());
            // not working System.out.println(collection.isEmpty());
            System.out.println(collection.equals(otherCollection));

    }
}