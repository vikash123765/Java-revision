import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {


        Thread thread1 = new Thread(()-> {
            synchronized (Main.class) {
                list.add(random.nextInt());
            }
        });

        Thread thread2 = new Thread(()-> {

            synchronized (Main.class) {
                System.out.println("reading the list :" + list);  
            }

        });
        thread1.start();
        thread2.start();

    }
}