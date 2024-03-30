public class Main  implements Runnable{

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

        Main thread1 = new Main();
        Thread t1 = new Thread(thread1);
        t1.start();

        Main thread2 = new Main();
        Thread t2 = new Thread(thread2);
        t2.start();

        Main thread3 = new Main();
        Thread t3 = new Thread(thread3);
        t3.start();


    }
}