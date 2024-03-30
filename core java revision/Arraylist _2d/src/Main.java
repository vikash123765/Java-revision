import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 2D arraylist is a list of  muliple lists
        // you can change the size of list during runtime( after complitation)

        ArrayList<ArrayList<String>> resurangmanue = new  ArrayList<>();


        ArrayList<String> bakerylist = new ArrayList<String>();
        bakerylist.add("bread");
        bakerylist.add("pasta");
        bakerylist.add("kanelbular");

        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("water");
        drinks.add("sprite");
        drinks.add("coke");

        ArrayList<String> maincourse = new ArrayList<String>();
        maincourse.add("kebab ");
        maincourse.add("steak");
        maincourse.add("biryani");

      resurangmanue.add(bakerylist);
      resurangmanue.add(drinks);
      resurangmanue.add(maincourse);

        System.out.println(resurangmanue.get(0).get(2));

    }
}