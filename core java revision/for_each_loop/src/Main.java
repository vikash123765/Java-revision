import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //String[] animals = {"cat","dog","rat"};

        ArrayList<String> animals = new ArrayList<>();
        animals.add("rat");
        animals.add("dog");
        animals.add("bunny");
        animals.add("elephants");

        for (String i : animals){
            System.out.println(i);
        }

    }
}