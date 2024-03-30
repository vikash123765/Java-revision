public class Main {
    public static void main(String[] args) {

        int age = 76;

        if(age <= 18){
            System.out.println("you are not a adult sorry you cant acees this ");
        }
        else if (age>= 18   && age  <=75 ){
            System.out.println("you are an adult");

        }else {
            System.out.println("you are senior citizen");
        }

    }
}