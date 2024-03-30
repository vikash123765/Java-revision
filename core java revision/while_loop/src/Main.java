import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //while loop executed the code as long as the decision stays true
        // do loop always exictutes the block of code atleast once even if condition is false
      Scanner scanner = new Scanner(System.in);
      String name ="";

       do{
          System.out.println("please enter your name");
        name = scanner.nextLine();

      }while(name.isBlank());
        System.out.println("hello" + name);
    }
}