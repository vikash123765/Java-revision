import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  implements ActionListener {


    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("smallpointer.png");
        ImageIcon icon2 = new ImageIcon("pig.jpeg");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 15);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(300, 150, 220, 220);
        // button.addActionListener(e -> System.out.println("ghäda")); // sama as implement acion event listener but with less code
        button.addActionListener(this);
        button.setText("Im a button");
        button.setIcon(icon);
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("ghäda");
            label.setVisible(true);
        }

    }
}
