public class Main {
    public static void main(String[] args) {
        // array = used to store muliple values in a single variable

        //String[] cars ={"bmw","benz","masarati","volvo"};

        //replace car model with index posistion
        //cars[0] = "mustang";

// another way to write arrays where you predifine how many variables it will contain
        String[] cars = new String[3];

        cars[0] = "bmw";
        cars[1] = "masrati";
        cars[2] = "volvo";

        // System.out.println(cars[0]);

        // for loop to print out all the variables in the array
        for(int i  = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }


    }
}