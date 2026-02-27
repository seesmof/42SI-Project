import javax.swing.*;
import org.antlr.v4.runtime.*;

void main() {
    JFrame frame = new JFrame();
    JTextArea textArea = new JTextArea();
    textArea.setBounds(10, 10, 465, 440);
    frame.add(textArea);

    frame.setSize(500, 500);
    frame.setLayout(null);
    frame.setResizable(false);
    frame.setVisible(true);

    String input=textArea.getText();
    CharStream stream = CharStreams.fromString(input);
}