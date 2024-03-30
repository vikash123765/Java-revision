public class Main {
    public static void main(String[] args) {
       // constructor = special method that is called when a intence in main klass is created

        Human human1 = new Human();
        human1.age=23;
        human1.height=123.45;
        human1.name="vikash";

        System.out.println("this is" + human1.name);
        System.out.println(human1.name+"is"+ human1.age + "years old");
        System.out.println(human1.name+" heght is"+ human1.height);
        human1.fast();

        System.out.println();

        Human human2 = new Human();
        human2.age=22;
        human2.height=133.45;
        human2.name="anders";

        System.out.println("this is" + human2.name);
        System.out.println(human2.name+"is"+ human2.age +"years old");
        System.out.println(human2.name+" height is"+ human2.height);
        human2.slow();


    }
}