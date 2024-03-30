import java.io.*;

public class VyteStream {
    public static void main(String[] args) {

        FileInputStream instream = null;
        FileOutputStream outstream =null;


        try{
            instream= new FileInputStream("C:\\Users\\vikas\\Desktop\\source.txt");
            outstream = new FileOutputStream("C:\\Users\\vikas\\Desktop\\dest.txt");
        }catch(Exception e){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
