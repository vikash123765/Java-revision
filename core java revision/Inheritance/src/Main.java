public class Main {
    public static void main(String[] args) {

       // process where one class aquires the attributed/methods of another class

        Car car = new Car();

       // System.out.println("this veichle speed is " );

        car.go();

        car.stop();

        System.out.println();

        Bicycle bicycle = new Bicycle();

        bicycle.stop();

        bicycle.go();

        System.out.println("car has this many dorrs: " +car.doors);
        System.out.println("bysicle has this many peadels: " +bicycle.peadels);
    }
}