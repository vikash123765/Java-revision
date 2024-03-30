import java.lang.reflect.Method;

public class Main {

    @MyCustomAnnotation(value = 10)
    public  void sayhello() {
        System.out.println("my custom annotation");
    }
    public static void main(String[] args) throws NoSuchMethodException {
       // providing informarion to the compiler
        //compile time and deployment process time
        // runtime processing

        // thi is just to see what the annotation is doing
Main m = new Main();
        Method methodval = m.getClass().getMethod("sayhello"); // search the class for megthod name hello calling the method


     MyCustomAnnotation myCustomAnnotation = methodval.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is :" + myCustomAnnotation.value()); // will display value with via using reference type



    }
}