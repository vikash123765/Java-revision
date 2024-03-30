import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("poem.txt");

        fileWriter.write("roses are red \n violets are blue \n sky is blue \n  ");
        fileWriter.append("\n(ratman)");
        fileWriter.close();

    }
}