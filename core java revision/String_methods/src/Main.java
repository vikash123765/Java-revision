import java.lang.invoke.StringConcatFactory;

public class Main {
    public static void main(String[] args) {

       // String a reference dattype that can acces useful methos

        String name ="   Vikash Kosaraju    ";


        boolean result = name.equals("Vikash Kosaraju");
        boolean result2 = name.equalsIgnoreCase("Vikash Kosaraju");
        int result3 = name.length();
        char result4 = name.charAt(3);
        int result5 =name.indexOf("a");
        boolean result6 = name.isEmpty();
        String result7 = name.toLowerCase();
        String result8 = name.toUpperCase();
        String result9 = name.trim();
        String result10 = name.replace("a","b");



        System.out.println(result10);
    }
}