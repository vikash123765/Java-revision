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

            ResultSet resultSet = statement.executeQuery("select * from customers");

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) +" "+ resultSet.getString(2) +" "+ resultSet.getString(3) + " "+resultSet.getInt(4));

            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
}