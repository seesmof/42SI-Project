import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.PrintStream;

import gen.RustLexer;
import gen.RustParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static String appName = "42SI.1 Text Editor";

    public static void main(String[] args) {
        JFrame frame = new JFrame(appName);
        JTextArea inputField = new JTextArea("fn main() {\n  let x = 10;\n}");
        JTextArea outputField = new JTextArea();
        JButton analyze = new JButton("Analyze");
        JButton upload = new JButton("Upload");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(analyze);
        panel.add(upload);

        frame.setLayout(new GridLayout(3,1));
        frame.add(inputField);
        frame.add(panel);
        frame.add(outputField);
        outputField.setEditable(false);

        analyze.addActionListener(e -> {
            outputField.setText("");
        });

        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
