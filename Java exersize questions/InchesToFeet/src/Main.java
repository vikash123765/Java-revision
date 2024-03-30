import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //a
      /* int inches= 33;

        int feet = inches/12;

        System.out.println("your are " +feet + " feet");
*/



       Scanner scanner = new Scanner(System.in);
        System.out.println("please ennter your height in inches");
         int inches =  scanner.nextInt();
         int feet = inches/12;
         System.out.println("your height is: " + feet + "feet" );
    }
}