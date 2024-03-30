public class Main {
    public static void main(String[] args) {

      //template that can be applied to a class . but specifik to what a class has/must do
        //classes can apply more then one interface

        Rabbit rabbit = new Rabbit();
       rabbit.flee();

       Hawk hawk = new Hawk();
       hawk.hunt();

       Fish fish = new Fish();
       fish.flee();
       fish.hunt();
    }
}