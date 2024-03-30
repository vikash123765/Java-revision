import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("enetr your name");
        JOptionPane.showMessageDialog(null,"hello" +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enetr your age"));
        JOptionPane.showMessageDialog(null,"you are" +age + "old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("enetr your height"));
        JOptionPane.showMessageDialog(null,"you are" +height + "cm");
    }
}