public class Main {
    public static void main(String[] args) {

        // object can identify as more then one data type

        Car car = new Car();
        Bicycle bicycle= new Bicycle();
        Boat boat = new Boat();

         Veichle racers [] = {car,bicycle,boat};

        /* car.go();
         bicycle.go();
         boat.go();*/



        for(Veichle x: racers) {
            x.go();
        }
    }
}
