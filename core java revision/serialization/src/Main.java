import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // serialization == converting an objecy into a byte stream == saving a file with the objects information

        // deserialisation == the reverse process of converting a byte stream into
        // aa object == as if loading a saved file

   User user  = new User();

   user.name="anders";
   user.password="indi123";

        FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("object info saved");

        //serial version need to be same to deserialise
       //  long serialVersionUID = objectStreamClass.lookup(user.getClass().getSerialVersionUID());

    }
}