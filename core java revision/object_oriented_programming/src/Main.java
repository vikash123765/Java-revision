public class Main {
    public static void main(String[] args) {
   // object = instance of a class that coitains attributes and methods

        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println("car model is:"+car1.model);
        System.out.println("car yeear is:"+car1.year);
        System.out.println("car top speed is :"+car1.topspeed);

        car1.moving();
        car1.brake();

        System.out.println();
        System.out.println("car model is:"+car2.model);
        System.out.println("car yeear is:"+car2.year);
        System.out.println("car top speed is :"+car2.topspeed);

        car2.moving();
        car2.brake();

        // we need constructor to have diffrent variables for multiple instances of class
    }
}