public class Main {
    public static void main(String[] args) {

        // overloaded methods that share the same name but have diffrent parameters

    //int x = add(12,45,34,45);
     double z = add(12.23,3.34);
        System.out.println(z);

    }

    static int add(int a,int b){
        System.out.println("this is overloaded method 1");
    return  a + b ;
    }
    static int add(int a,int b,int c){
        System.out.println("this is overloaded method 2");
        return  a + b + c;
    }

    static int add(int a ,int b, int c,int d){
        System.out.println("this is overloaded method 3");
        return  a + b + c+ d;
    }

    static double add(double a,double b){
        System.out.println("this is overloaded method 1");
        return  a + b ;
    }
    static double add(double a,double b,double c){
        System.out.println("this is overloaded method 2");
        return  a + b + c;
    }

    static double add(double a ,double b, double c,double d){
        System.out.println("this is overloaded method 3");
        return  a + b + c+ d;
    }
}