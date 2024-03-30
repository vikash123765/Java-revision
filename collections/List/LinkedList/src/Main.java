import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
         // dont have to shoft eemnts to left side where we delete only have to uppdate information to nodes around so removing item wont affect other items index position
        // stored as indiviudal nodes , each node has a connection to the next and previous node
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(2);
        list.remove(Integer.valueOf(3)); // removing the actual elemnt not index

       list.clear();

       // que = datastructure tat follows the first in first out model = the first elemt we add in to the que is the first ine that will be removeed
       list.offer(1);
        list.offer(2);
        list.offer(3);


        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        list.clear();

        //  stack. last in last out model = the last elemnt we add will be first one to be removed


        list.push(1);
        list.push(2);
        list.push(3);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());


    }
}