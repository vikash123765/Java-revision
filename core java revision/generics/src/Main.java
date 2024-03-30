import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


   /*     // muliple datatypes

        Integer[] intarray = {1, 2, 3, 4, 5};

        Double[] doublearray = {1.2, 2.3, 3.4, 4.5, 5.6};
        //Character[] chararray={"c","","","",""};
        String[] stringsarray = {"v", "i", "k", "a", "s"};

       // displayArray(intarray);
        //displayArray(doublearray);
        //displayArray(stringsarray);

        System.out.println(getFirstElement(intarray));
        System.out.println(getFirstElement(doublearray));
        System.out.println(getFirstElement(stringsarray));
    }

    // integer method
    public static void displayArray(Integer[] array) {
        for (Integer x : array) {
            System.out.println(x + "");
        }
        System.out.println();
    }

    // double method
    public static void displayArray(Double[] array) {
        for (Double x : array) {
            System.out.println(x + "");
        }
        System.out.println();
    }

    //String method

    public static void displayArray(String[] array) {
        for (String x : array) {
            System.out.println(x + "");
        }
        System.out.println();

    }


    // one version dat accepts all data types, we dont need indivudal methods for each data type

    public static <Thing> void displayArray(Thing[] array) {
        for (Thing x : array) {
            System.out.println(x + " ");
        }
        System.out.println();

    }

    public static <Thing> Thing getFirstElement(Thing[] array) {
return array[0];

    }
*/


        // more practical scenario

/*        Player player = new Player();
        Enemy enemy = new Enemy();
        Tree tree = new Tree();

        draw(player);
        draw(enemy);
        draw(tree);
    }

    // we dont need individual methods for all the data types we can solve this wih generics
    public sta tic <Ting> void draw(Ting x){
        x.draw();

    }*/


        //MyGenericClass<String,Integer> myStringClass = new MyGenericClass("vikash",9);
        MyGenericClass <Double,Double>myDoubleClass = new MyGenericClass(23.23,22.2);
        MyGenericClass <Integer,Integer>myIntegerClass = new MyGenericClass(22,21);

        HashMap<Integer,String> users = new HashMap<>();
        users.put(1,"vikash");

        System.out.println(myDoubleClass.getValue());
        System.out.println(myIntegerClass.getValue());
      //  System.out.println(myStringClass.getValue());

    }

}