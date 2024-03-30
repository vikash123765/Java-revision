

public class Main {
    public static void main(String[] args) {

  Color c1 = Color.RED;


        System.out.println("Enum name is " + c1.name());


        System.out.println("Enum value is " + c1. getValue());

        for(Color color:Color.values()){
           // System.out.println("Enum values" + color.getValue());
            System.out.println("Enum name" + color.name());
        }
    }
}