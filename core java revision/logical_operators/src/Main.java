import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // logical operators
        // && and || !
        //int temp = 25;
        //if(temp> 35){
          //  System.out.println("it is hot outside");
        //}else if (temp>=20 && temp<=30){
            //System.out.println("its is perfect weather");
        //}else {
            //System.out.println("it is cold outside");
        //}

        Scanner scanner = new Scanner(System.in);
        System.out.println("you are playing a game press q or Q to end game");
        String decision = scanner.next();

        //if(decision.equals("q") || decision.equals("Q") )
        if(!decision.equals("q") && !decision.equals("Q") )
        {
            //System.out.println("you have left the game");
            System.out.println("you have are still in  the game");
        }else {
           // System.out.println("you are still playing the game");
            System.out.println("you hve left the game ");
        }
    }


}