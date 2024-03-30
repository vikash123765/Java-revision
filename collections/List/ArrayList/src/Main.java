import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> people  = new ArrayList<>();
        people.add("jonny");
        people.add("bob");
        people.add("tural");
        people.add("vikash");
        //people.remove("jonny");
       // people.remove(1);
        people.clear();
        if(people.contains("vikash")){
            System.out.println("vikash is in the list ");
        }

        if(people.isEmpty()){
            System.out.println("the list is empty ");
        }


    }


}