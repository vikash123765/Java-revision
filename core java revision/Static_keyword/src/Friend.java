public class Friend {
    String name;
static int numeOfFriends;




    Friend(String name ){
        this.name=name;
        numeOfFriends++;
    }
    static void displayFriends(){

        System.out.println("you have" + numeOfFriends + "friends");
    }
}
