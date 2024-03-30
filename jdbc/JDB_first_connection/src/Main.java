import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.time.chrono.JapaneseEra.values;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");

            Statement statement= connection.createStatement();

            //update
            //String sql ="update customers  set first_name = 'genghis' where customer_id = 9";

            // adding
            //String sql ="insert into customers (customer_id,first_name,last_name) values(9,'gta','ggtgas')";

            //deleting
             String sql ="delete from customers  where customer_id=9";


            int i = statement.executeUpdate(sql);

            if (i>0){
                System.out.println("data inserted");
            }else {
                System.out.println("data not inserted");
            }

        } catch (Exception e){
            System.out.println(e);
        }



    }
}