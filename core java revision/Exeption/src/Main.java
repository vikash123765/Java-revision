import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // exepction = an event that occurs during runtime that disrupts the normal flow of instructions;

         try {
             Scanner scanner = new Scanner(System.in);
             System.out.println("Enter a whole number to devide");
             int numberA = scanner.nextInt();
             System.out.println("Enter a whole number to devide by ");
             int numberB = scanner.nextInt();

             int result = numberA / numberB;

             System.out.println("result is " + result);

         }catch(ArithmeticException e){
             System.out.println("you cant devide by zero ");

        }catch (InputMismatchException e) {
             System.out.println("please input a number");



        }catch (Exception e){
             System.out.println("something went wrong ");
         }
         finally {
            // System.out.println("this will always print");
           // this is not workig question for bhanu : scanner.close();
         }
    }
}