public class Main {
    public static void main(String[] args) {

        // here we ce´reate instanication of Food Class
        //Food[]  fridge = new Food[3];

        // here we create muliple objects so we can pass diffrent variables
        Food food1 = new Food("pizzz");
        Food food2 = new Food("chicken");
        Food food3 = new Food("eggs");

        Food[] fridge = {food1,food2,food3};

    //  fridge[0] = food1;
      //  fridge[1] = food2;
       // fridge[2] = food3;

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);
    }
}