public class Main extends  Thread {


    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                Thread.sleep(500);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }



    }


    public static void main(String[] args) {


        Main t1 = new Main();

        t1.start();

        Main t2 = new Main();

        t2.start();

        Main t3 = new Main();


        t3.start();




    }
}