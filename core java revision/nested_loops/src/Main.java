import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // nested loops = a loop  inside a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        System.out.println("enter your rows");
        rows = scanner.nextInt();
        System.out.println("enter your columns");
        columns = scanner.nextInt();

        System.out.println("choose your symbol ");
        symbol = scanner.next();


   // outer loops going to be i charg of the rows

      for(int i = 1; i <= rows; i++ ){
          System.out.println();
         //inner for loop in charge of columns
         for(int j =1; j <= columns; j++){
             System.out.print(symbol);

         }
      }
    }
}