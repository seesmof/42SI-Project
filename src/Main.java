import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

import gen.RustLexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static String appName = "42SI.1 Text Editor";

    public static void main(String[] args) {
        JFrame frame = new JFrame(appName);
        JTextArea inputField = new JTextArea("fn main() {\n  let x = 10;\n}");
        JTextArea outputField = new JTextArea();
        JButton button = new JButton("Run");

        frame.add(inputField, BorderLayout.NORTH);
        frame.add(outputField, BorderLayout.SOUTH);
        outputField.setEditable(false);
        frame.add(button, BorderLayout.CENTER);

        button.addActionListener(e -> {
            RustLexer lexer = new RustLexer(new ANTLRInputStream(inputField.getText()));
        });

        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
