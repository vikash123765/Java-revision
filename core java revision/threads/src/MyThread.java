public class MyThread extends Thread{
    // to create muliple threads we need to create a child class of the main thread class


    @Override
    public void run(){

        if(this.isDaemon()){
            System.out.println("this is a deamon thread that is running");

            }else{
            System.out.println("this is a user thred");
            }
        }

    }

