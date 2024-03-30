import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        //  when we want to remove elemnt in this class they are selceted based on priorety


        PriorityQueue<Integer> que = new PriorityQueue<>();

        // alement are dictadeb by decending order and their value dictates their priorety
        que.offer(5);
        que.offer(2);
        que.offer(6);

        System.out.println(que.poll());
        System.out.println(que.poll());


// when handeling more complex systems as user profile
        PriorityQueue<UserProfile> usersQue = new PriorityQueue<>(
                Comparator.comparing((UserProfile u) -> u.age)
        );

        usersQue.offer(new UserProfile(20));
        usersQue.offer(new UserProfile(30));
        usersQue.offer(new UserProfile(40));

        System.out.println(usersQue.poll().age);

    }

    static class UserProfile {


        private final Integer age;

        public UserProfile(Integer age) {
            this.age = age;

        }

        public Integer getAge() {
            return age;
        }


    }
}