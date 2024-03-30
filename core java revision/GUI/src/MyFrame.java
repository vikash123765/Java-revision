import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("JFrame title goes here"); // this sets title of FRame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exists out of the application
        this.setResizable(false); // orevent frame from being reSIZABLR
        this.setSize(420,420); // this sets the x dimension and the y dimension of our frame
        this.setVisible(true);    // makes this visable

        ImageIcon image = new ImageIcon("Mitt projekt-1.png"); // this will create an image icon
        this.setIconImage(image.getImage()); // change icon of frame

        // this.getContentPane().setBackground(Color.green); // default system colors

        this.getContentPane().setBackground(new Color(2,45,68)); // custom  color
    }

}
