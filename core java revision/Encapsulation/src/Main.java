public class Main {
    public static void main(String[] args) {
    // encapsulation = attributes private/hidden. can not be aceess directly only trough getter and setter
        // you should make attributes private if you dont have reason to make them private


        Car car = new Car("tesla","fastcharger",1996);
        System.out.println(car.getMake());

        car.setyear(1946);

        System.out.println(car.getYear());



    }
}