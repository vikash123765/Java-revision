import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       final int twen;
        final int tens;
        final int fives;
        final int ones;
        System.out.println("ENter the number of dollars");

        int dollar = scanner.nextInt();

        twen = dollar/20;
        dollar= twen * 20;
        tens = dollar/10;
        dollar = tens * 10;
        fives = dollar/5;
        dollar = fives * 5;
        ones = dollar;
        System.out.println("20s" +twen + "\n"+ "10" + tens + "\n" +"fives" + fives + "\n" + "1s" + ones  );


    }
}