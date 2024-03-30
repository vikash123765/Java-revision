public class MyRunnable implements Runnable{
    @Override
    public void run() {

        
        for (int i=0; i < 10; i ++){

            System.out.println("thred number 2: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("thred number 2 is finished");

    }
}
