import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        int ticket1 = 12345;
        int ticket2 = 12710;
        int ticket3 = 15412;


        if (ticket1 % 7 == 4) {
            System.out.println("true");
        } else if (ticket2 % 7 == 3) {
            System.out.println("true");
        } else if (ticket3 % 7 == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/


        Scanner scanner = new Scanner(System.in);

        int ticketNum;
        System.out.println("enter ticket number");
        ticketNum = scanner.nextInt();

        int removenum = ticketNum/10;
        int lostnum = ticketNum %10;

        int remainder = removenum%7;

        if(lostnum == remainder){
            System.out.println("ticket is valid");
        }else{
            System.out.println("Ticket in invalid");
        }

    }
}