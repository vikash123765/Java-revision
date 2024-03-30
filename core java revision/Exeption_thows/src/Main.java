import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    // throws will check all code block automatically for error so we dont have to put individual try catch for every code block.
    public static void main(String[] args) throws Exception{

        System.out.println("hello vikash");

        // this is database code = jdbc = high risk/may be corrected data
 /*     try {
          Class.forName("");
          Connection con = DriverManager.getConnection("");
          Statement st = con.createStatement();
      }catch(Exception e) {
          System.out.println("something went wrong");
      }

        try {
            Class.forName("");
            Connection con = DriverManager.getConnection("");
            Statement st = con.createStatement();
        }catch(Exception e) {
            System.out.println("something went wrong");
        }
*/
        // here we use try catch muiliple times its is not optimal

        // Here we Add throws Exeption in main method it will automatcilly check
        // code blocks for errors. if any errror we only apply
        //try catch to the block of code with error
        Class.forName("");
        Connection con = DriverManager.getConnection("");
        Statement st = con.createStatement();

        Class.forName("");
        Connection con1 = DriverManager.getConnection("");
        Statement st1 = con.createStatement();

         // for example if there is error here we use try catch
        try {
            Class.forName("");
            Connection con2 = DriverManager.getConnection("");
            Statement st2 = con.createStatement();
        }catch(Exception e){
            System.out.println("there is some error");
        }

    }
}