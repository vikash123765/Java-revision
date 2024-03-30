import java.sql.SQLOutput;
import java.util.concurrent.*;

public class Future_Demo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(10000);
            return "Completed ";
        });

        try {
        while (!future.isDone()){
            System.out.println("Task still in progress...wait");
            Thread.sleep(500);

        }
            System.out.println("task is completed");
        String result = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);
            executorService.shutdown();

        }catch (InterruptedException | RuntimeException | TimeoutException | ExecutionException e){
            future.cancel(true);
            future.isDone();
            future.isCancelled();

        }



    }

}
