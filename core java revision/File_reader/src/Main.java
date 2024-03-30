import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

     // fileread = allows us to read the content of a file as stream och characters, one by one
        // read and returns a in value which contains the byte value
        // when read() returns -1 there is no more data gto read

        FileReader fileReader = new FileReader("art.txt");

        int data = fileReader.read();
        while(data != -1){
            System.out.println((char)data);
            data = fileReader.read();
        }fileReader.close();
    }
}