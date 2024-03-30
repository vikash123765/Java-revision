import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    User user = null;

        FileInputStream filein = new  FileInputStream("C:\\Users\\vikas\\Desktop\\core java revision\\serialization\\UserInfo.ser");
        ObjectInputStream objectin =new ObjectInputStream(filein);
        user  =(User) objectin.readObject();
        filein.close();
        objectin.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}