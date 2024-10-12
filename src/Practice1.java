import javax.swing.*;
import java.awt.*;

public class Practice1 {

    // declare variables
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private JTextField textField;

    public static void main(String[] args) {
        Practice1 p = new Practice1();

    }

    public Practice1(){
        // construct variables
        frame = new JFrame("Practice 1");
        panel = new JPanel(new GridLayout(3,1));
        button = new JButton("Click here!");
        label = new JLabel("Label :(");
        textField = new JTextField("Enter Text Here");

        // organize the layout
//        panel.add(button, BorderLayout.NORTH);
//        panel.add(label, BorderLayout.CENTER);
        panel.add(button);
        panel.add(label);
        panel.add(textField);

        frame.add(panel);

        // actually make fram happen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }


}
