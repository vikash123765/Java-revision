public class Electiom {


    // throw : when we create our own exeption which we can not find automaticlly in java, we use  throw.

    public static void main(String[] args) {

       votingage(15);




    }

static void votingage(int age) {

    if (age < 18) {
        try {                           //here we are passing string value we passed in age checker constructor as argument
            throw new Age_checker("you are not able to vote");
        } catch (Age_checker a) {
            a.printStackTrace();
        }
        }else{
            System.out.println("your vote is done");

        }

    }



}
