public class Main {
    public static void main(String[] args) throws InterruptedException {



        //multi threading= this is the process of executing multiple threads simultanuisly, helps maximize the utalization  of
        // the CPU, threads are indipedent for example an expectio in one thread will not
        // effect another thread. useful for serving muliple clients, muliplayer games or other mutualli idependent tasks

        // via sublass extends you hav acess to ru method
        MyThread thred1 = new MyThread();



         // the other way of creating thread, create intance if runnbale class an pass it ass
        // an argument to Thread class. here we can still use inheritance which we can not in extends
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

    //    thred1.setDaemon(true);   // when there is o more user threads java terminates
      //  thread2.setDaemon(true);

        thred1.start(); //this is for running them simultaniuslk
         thread2.start();

       // thred1.start();
      //thred1.join(98000);
      //thread2.start();      // waiting for one thread be done



     //  System.out.println(1/0);


    }
}