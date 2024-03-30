import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        HashMap<String,Integer> populationByCity = new HashMap<>();

        // stores data as key value pair basically a llok out tabe

        populationByCity.put("stockholm",900000);
        populationByCity.put("hyderabad",1100000);
        populationByCity.put("helsiniki",700000);

        Integer population = populationByCity.get("stockholm");

        if(populationByCity.containsKey("stockholm")){
            System.out.println("we got stockholms population ");

        }
        // iterate entries  will not exute based on insertion order

        populationByCity.keySet();
        populationByCity.values();
        populationByCity.entrySet();


        // link list will execute based on insertion orde
        LinkedHashMap<String,Integer> orderMap = new LinkedHashMap<>();




    }
}