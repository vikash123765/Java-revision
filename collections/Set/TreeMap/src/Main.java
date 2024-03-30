import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

         // keeps the entries sorted by keys

        TreeMap<String,Integer> sortedMap = new TreeMap<>();

        sortedMap.put("key1",10);
        sortedMap.put("key3",20);
        sortedMap.put("key2",30);
        sortedMap.put("key4",40);

        sortedMap.entrySet().forEach(System.out::println);

        System.out.println(sortedMap.higherEntry("key2"));
        System.out.println(sortedMap.lowerEntry("key2"));



    }
}