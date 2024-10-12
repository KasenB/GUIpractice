import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Homework2 {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JTextArea textArea;

    public static void main(String[] args) {
        Homework2 h = new Homework2();
    }

    public Homework2(){
        frame = new JFrame("Homework 2");
        panel = new JPanel(new BorderLayout());
        button = new JButton("Button 1");
        label = new JLabel("Label 1 :(");
        textField = new JTextField("This is a text field");
        textArea = new JTextArea("This is a text area");

        panel.add(button, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.CENTER);
        panel.add(textField, BorderLayout.SOUTH);
        panel.add(label, BorderLayout.WEST);
        frame.add(panel);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
