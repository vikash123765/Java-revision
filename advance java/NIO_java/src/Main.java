import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) throws IOException {

/*
     // ceating fin ovject and then creating filechanel because we are dealing with file
        FileInputStream fin = new FileInputStream("C:\\Users\\vikas\\Desktop\\source.txt");
        FileChannel readchannel = fin.getChannel();
       // creating bytebuffer and giving it some starting size
        ByteBuffer readbuffer = ByteBuffer.allocate(1024);
     //  calling read method on the chanel readchanel
        int result = readchannel.read(readbuffer);
        // read the chanel via the buffer and the read method is goin to return a result
        System.out.println("file was read succesfully"+ result);
*/

       // creating ooutput stream because we need to write something
        FileOutputStream fout = new FileOutputStream("C:\\Users\\vikas\\Desktop\\dest.txt");
        // next thing we crate a chanel write chanel
        FileChannel writeChanel = fout.getChannel();
        // creating a buffer which is write buffer
        ByteBuffer writebuffe = ByteBuffer.allocate(1023);
        // this is the string i want to erite to the file url
        String message = "this test i a string";
        // getting byte representation of the string
        writebuffe.put(message.getBytes());
       // restting the idex
        writebuffe.flip();
       // writing the buffer to the chanel 
        writeChanel.write(writebuffe);
        System.out.println("the file written sccessfully ");

    }
}