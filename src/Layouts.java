import javax.swing.*;
import java.awt.*;

public class Layouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton firstButton = new JButton("First");
        JButton secondButton = new JButton("Second");
        JButton thirdButton = new JButton("Third");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        panel.add(firstButton);
        panel.add(secondButton);
        panel.add(thirdButton);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}