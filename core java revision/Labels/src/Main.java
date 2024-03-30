import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //  JLabel = GUI  dislay area for a string of texts, an image or both

        JLabel label = new JLabel(); // will cresate a label
        label.setText("bro do you even go to the gym"); // set text of label
        ImageIcon image = new ImageIcon("image_demo.jpeg");

        Border border = BorderFactory.createLineBorder(Color.green);
        label.setHorizontalTextPosition(JLabel.CENTER); // sets image LEFT,CENTER,RIGHT of icon
        label.setVerticalTextPosition(JLabel.TOP);   // sets image TOP,CENter, botoom  of imave icon
        label.setForeground(new Color(23,67,89)); // set font color
        label.setFont(new Font("MV Boli",Font.PLAIN,34)); // set font size
        label.setIconTextGap(-24);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // sets vertical poisiton of icon + text within label.
        label.setHorizontalAlignment(JLabel.CENTER); // sets horizontal poisiton of icon + text within label. (will always have this position eeven if we resize)
        //label.setBounds(100,100,300,300); // this will set x,and y and frame label dimension



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(550,550);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label); // add componenets first and then prame.pack will work
        label.setIcon(image);
        frame.pack(); // will automatically resize frame based on the label on text
    }
}