public class Main {
    public static void main(String[] args) {

        Car car = new Car("tesla","fastcharger",1996);
        // before construction of car 2
        //Car car2 = new Car("bmw","i34",1745);
        //car2.copy(car);

        // after construction of car 2
        Car car2 = new Car(car);

        System.out.println(car);
        System.out.println(car2);
        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}