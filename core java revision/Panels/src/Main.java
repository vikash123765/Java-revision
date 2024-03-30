import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Jpanel = GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("smallimage.png");

        JLabel label = new JLabel();
        label.setText("hi");
        label.setIcon(icon);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        //label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(0,0,200,200);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
         redPanel.setLayout( null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        redPanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(550,550);
         frame.setLayout(null);
        frame.setVisible(true);

        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}