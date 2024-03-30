import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    //Array list = a rezisable array where you cant add or remove variable after runtime.is böe to store referance datat ypes

                  //need to use wraper class
        ArrayList<String> food = new ArrayList<String>();

        food.add("burger");
        food.add("pizza");
        food.add("kebab");

        food.set(0,"biryani");
        food.remove(1);
        food.clear();



                        // in array list we use food.size
        for(int i  = 0; i <food.size(); i++){
            System.out.println(food.get(i));
        }



    }
}