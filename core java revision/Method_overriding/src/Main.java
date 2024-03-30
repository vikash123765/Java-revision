public class Main {
    public static void main(String[] args) {
 // overiding method in th parent class in the child class. done so child can giv its own implementati
// this makes it possible to crate implemaatation oif something that is more specific to that class for example dog goes bark
        Animal animal = new Animal();
        animal.speak();

        Dog dog= new Dog();
        dog.speak();

    }
}