public class Main {
    public static void main(String[] args) {


         // overloaded constru tors is muliple constuctors in same class but with diffrent parametrs similar to overloaded methods

        Pizza pizza = new Pizza("mozarella","thin crust","salami","tomato sauce");
        System.out.println("this is the ingredients of pizza1:");
        System.out.println("here are the ingdrediants:"+ pizza.bread);
        System.out.println("here are the ingdrediants:"+ pizza.sauce);
        System.out.println("here are the ingdrediants:"+ pizza.cheese);
        System.out.println("here are the ingdrediants:"+ pizza.topping);

        System.out.println();
        Pizza pizza2 = new Pizza("mozarella","thin crust","salami");
        System.out.println("this is the ingredients of pizza2:");
        System.out.println("here are the ingdrediants:"+ pizza2.bread);
        System.out.println("here are the ingdrediants:"+ pizza2.cheese);
        System.out.println("here are the ingdrediants:"+ pizza2.topping);

        System.out.println();

        Pizza pizza3 = new Pizza("mozarella","", "salami");{
            System.out.println("this is the ingredients of pizza3:");
            System.out.println("here are the ingdrediants:"+ pizza3.cheese);
            System.out.println("here are the ingdrediants:"+ pizza3.topping);


        }

        System.out.println();

        Pizza pizza4 = new Pizza("","", "salami");{
            System.out.println("this is the ingredients of pizza4:");
            System.out.println("here are the ingdrediants:"+ pizza4.topping);

        }


    }
}