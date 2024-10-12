import javax.swing.*;
import java.awt.*;

public class Homework1 {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JButton button2;
    private JLabel label;
    private JLabel label2;
    private JTextField textField;

    public static void main(String[] args) {
        Homework1 h = new Homework1();
    }

    public Homework1(){
        // construct variables
        frame = new JFrame("Homework 1");
        panel = new JPanel(new GridLayout(2,2));
        button = new JButton("Click here 1");
        button2 = new JButton("Click here 2");
        label = new JLabel("Label Uno");
        label2 = new JLabel("Label Dos");
//        textField = new JTextField("Enter Text Here");

        // organize the layout
//        panel.add(button, BorderLayout.NORTH);
//        panel.add(label, BorderLayout.CENTER);
        panel.add(label);
        panel.add(button);
        panel.add(button2);
        panel.add(label2);

        frame.add(panel);

        // actually make fram happen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
