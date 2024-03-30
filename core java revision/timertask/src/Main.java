import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        // timer = a facility for threads to schedule taks for future execution in backround thread
        // timer task = a task that can be scheduled for one-time or repeated execution by timer


        Timer timer = new Timer();
        final int[] counter = {10};

        TimerTask task =new TimerTask() {
            @Override
            public void run() {

                if (counter[0] > 0 ){
                    System.out.println(counter[0] + "secounds");
                    counter[0]--;
                }else {
                    System.out.println("happy new year");
                    timer.cancel();

                }
            }
        };

       // timer.schedule(task,3000);

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2023);
        date.set(Calendar.MONTH,Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);

      //  timer.schedule(task,date.getTime());

        // repeating
        //timer.scheduleAtFixedRate(task,0,100);

        timer.scheduleAtFixedRate(task,date.getTime(),100);

    }
}