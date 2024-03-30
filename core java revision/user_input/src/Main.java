import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();


        System.out.println("what is your age? ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("what is your favorite food");
        String food = scanner.nextLine();

        System.out.println("hello " +  name );
        System.out.println("you are " +  age  + " years old" );
        System.out.println("your favorite food is " +  food );


    }
}