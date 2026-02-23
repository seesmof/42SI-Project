import javax.swing.*;

void main() {
    JFrame f = new JFrame();
    JTextArea text = new JTextArea();
    text.setBounds(10, 10, 465, 440);
    f.add(text);

    f.setSize(500, 500);
    f.setLayout(null);
    f.setResizable(false);
    f.setVisible(true);
}