import java.util.Random;

public class DiceRoller {
 /// this is global
    Random random;
    int number = 0;

    // if inside method its local and we need to pass intance of random and int value as argument
    DiceRoller(){
        random = new Random();

        roll(random,number);
    }

    void roll(Random random, int number){
    number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
