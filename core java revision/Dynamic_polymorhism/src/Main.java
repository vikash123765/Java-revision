import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //polymorphism = many shapes and forms
        // Dynamic = after compilation(during runtime)
        // examole a corvette is a corvette but is also a car and a veichle and an object


        Scanner scanner = new Scanner(System.in);
        System.out.println("what animal do you want ?  ");
        System.out.print("(1=dog) or (2 = cat) ");
        int respone= scanner.nextInt();
        Animal animal;

        if(respone==1){
       animal= new Dog();
       animal.speak();

        }
        else if(respone==2){
            animal = new Cat();
            animal.speak();


        }else{
            animal = new Animal();
            System.out.println("That choise was is invalid");
            animal.speak();
        }




    }
}