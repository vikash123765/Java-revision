public class Main {
    public static void main(String[] args) {



        Car car = new Car("masarati ");
        Car car2 = new Car("Lamborghini");

        Garage garage = new Garage();

        garage.park(car);
        garage.park((car2));
    }
}