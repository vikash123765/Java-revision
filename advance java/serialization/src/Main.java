import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("jhon", 23, "lilla sallskapetsvag 69");
        student.setX(23);

        String filename = "C:\\Users\\vikas\\Desktop\\serialize object.txt";

        FileOutputStream fileout = null;   // creating an object to able to write to the file
        ObjectOutputStream object = null;


        try {
            fileout = new FileOutputStream(filename);
            object = new ObjectOutputStream(fileout);
            object.writeObject(student); // write the student object to this file

            object.close();
            fileout.close();

            System.out.println("object has been serialized \n" + student);


        } catch (IOException e) {
            System.out.println("IO eception is cught ");
        }

        // desirialize

        FileInputStream filein = null;
        ObjectInputStream objectin = null;

        try {
            filein = new FileInputStream(filename); // telling  what file we want t o deserialix´ze
            objectin = new ObjectInputStream(filein); // we create an object of the input stream class. with this we read the object

            Student s = (Student) objectin.readObject();  // reading th eobject we need to store in a student object =s// when we serialize class typeis not remebered that is ewhy we need to specify
            System.out.println("object has been deserialised \n" + s);
            System.out.println("the deserialised value of x is :" + s.getX());
             objectin.close();
             filein.close();
        } catch (Exception e) {
            System.out.println("we hav caught the error");


        }


    }
}