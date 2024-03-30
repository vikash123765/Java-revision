/*

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {


    public static void main(String[] args) {

        executorInvoke();
        executorServiceInvoke();
    }

    public static void executorInvoke(String[] args) {


   Executor executor = new Caller();
   executor.execute( () -> {
       System.out.println("extecutor examplpe");


   });
    }

    public static void executorServiceInvoke(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit( () -> {
            System.out.println("extecutorService examplpe");});




}

    }


*/
