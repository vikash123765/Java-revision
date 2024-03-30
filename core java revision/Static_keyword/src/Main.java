public class Main {
    public static void main(String[] args) {
        // static = modifier . a singe copy of a variable/method that can be created and shared. the class owns the static memeber

       Friend friend1 = new Friend("ricky");
        Friend friend2 = new Friend("julian");
     //   System.out.println(Friend.numeOfFriends);  // name of class that own the static member followed by the static member you are trying to acess
        System.out.println(friend1.name);
        System.out.println(friend2.name);

        Friend.displayFriends();


    }
}