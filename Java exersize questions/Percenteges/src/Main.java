import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   double num1 = 25;
       double num2 =35;double x = computePercent(num1,num2);




        System.out.println("this is number 1 : " +num1  +"     5 of 35 is this manu proxent = "+ x+"%");
        }

         static  double computePercent(double num2,double num1) {

        double x = num2/num1 * 100 ;
        return x;*/




        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number one");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("enter number one");
        double num2 = scanner.nextDouble();
        double x = num1 / num2 * 100;

        System.out.println("this is number 1 : " + num1 + "     25 of 35 is this manu proxent = " + x + "%");


    }


}