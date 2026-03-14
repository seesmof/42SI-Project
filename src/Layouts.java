import javax.swing.*;
import java.awt.*;

public class Layouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea input = new JTextArea();
        JButton button = new JButton("Analyze");
        JTextArea output = new JTextArea();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        panel.add(input);
        panel.add(button);
        panel.add(output);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}