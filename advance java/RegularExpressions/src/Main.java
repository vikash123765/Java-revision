import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
    // finding a pattern in any type  of database

        //creating regexstring. .= any character  *= any number of characters
        //a-z=alphabetical section 0-9 = numerical section
        String regexStr = ".*[a-z][0-9].";
        Pattern pattern = Pattern.compile(regexStr); // this compiles the regular expression


        // calling matcher class on the pattern object(some integers and some alphabets then again integers )
        Matcher matcher = pattern.matcher("123456789ghvjgsvkjbf133");
        boolean matchFoond=matcher.find(); // clling matcher.find which will return a boolena value
        if(matchFoond){
            System.out.println("match found");

        }else {
            System.out.println("match not found");
        }

    }
}