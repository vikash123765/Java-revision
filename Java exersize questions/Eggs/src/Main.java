import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* double dosenEggs = 3.25;
        double egg = 0.45;


        Scanner scanner = new Scanner(System.in);
        System.out.println("how many eggs do you ant? ");
        int respone = scanner.nextInt();

        double costSingleeggs = respone * egg;

        System.out.println("that will be " + costSingleeggs + " in  total when bying for single eggs ");

        System.out.println("we have chepaer price if you take doszen please enter 12 if you want dozen eggs ");
        int respons2 = scanner.nextInt();
        double costDozeneggs = respons2 * 12;
        costDozeneggs = dosenEggs;
        System.out.println("cot for dozen egg will be: " + costDozeneggs);
        scanner.nextLine();
        System.out.println( "is that all? ");
        double totalcost = costSingleeggs + costDozeneggs;
        String answer = scanner.nextLine();

        System.out.println(" cost for single eggs will be: " + costSingleeggs+ " and cost of dosen eggs will be  " + dosenEggs + " so total costwill be: " + totalcost);





        System.out.println();
*/

        final double dozenEggs = 3.25;
         final double singlEgg = 0.45;

        Scanner scanner=  new Scanner(System.in);

        System.out.println("how many eggs do you want");
        int eggs = scanner.nextInt();
        int dozen = eggs/12;
         int  single = eggs%12 ;
         double total = (dozen * 3.25) + (single + 0.45);


        System.out.println("you ordered" + eggs + " eggs. " + "Thats  " + dozen + " dozen at 3.25 per dozen and " + single + " loose eggs for a total of" + total+ "." );









}
}