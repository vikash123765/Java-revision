public class Main {
    public static void main(String[] args) throws InterruptedException

    // Threads is when application can have multiple threads running concurently , each thread can exicute parts of the
            //code pararell with the main thread. Each thread has a priorety. Threads with giher
            //priorety are executed in preference compared to threads with lower priorety

            // machine continues to execute threads  erither the following happens:
            //1.the exist method of class RunTime  has been called
             //2. All user threads have died.
    {

      // System.out.println(Thread.activeCount()); // check how many threads are runnig
/*
        Thread.currentThread().setName("MAIN-THREAD");

        System.out.println(Thread.currentThread().getName() );    // get name of main thread
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority()); // gets priority of thread

        System.out.println(Thread.currentThread().isAlive()); // check to see if our main thread is alive

        for( int i=3; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("you are done");*/


     // Create instance of the MyThread class

        MyThread thread2 = new MyThread();
        thread2.setDaemon(false);   // setting thread to deamon thread
        System.out.println(thread2.isDaemon()); // check to see if thread is deamon thread

        thread2.start();
       // System.out.println(thread2.isAlive());

        thread2.setName("Second-thread ");

        System.out.println(thread2.getName());


             // inherits the priorety of the class that created it wgicg is main

          thread2.setPriority(2);
        System.out.println(   thread2.getPriority());

        System.out.println(Thread.activeCount());

        // there is 2 diffrent kind of threads
        //1. deamon thread is a low priorety thread that runs in the backround that performs tasks such as garbage collection
        //.2 java viritual machine terminates itself when all user thread are executed. when we create  thread it is a usser thread but we can chnage it to deamon thread



    }
}