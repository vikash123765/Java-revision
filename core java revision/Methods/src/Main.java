public class Main {
    public static void main(String[] args) {
/*// method is a block of code executed when its callled upon.
        String name = "vikash";
        int age = 123;
        hello(name,age);

    }
    // we are calling the hello method from static method main thats why we need to use static
    static void hello(String name, int age) {
        System.out.println("hello" + name + "you are"+age+ "yaers old");*/

    // method with return

    int x = 4;
    int y = 3;

  int z =    sum(x,y);

        System.out.println(z);


    }

    static int sum(int x,int y){
        int z = x+y;
        return z ;
    }

}