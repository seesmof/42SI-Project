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
        JButton button = new JButton("Run");

        frame.add(inputField, BorderLayout.NORTH);
        frame.add(outputField, BorderLayout.SOUTH);
        outputField.setEditable(false);
        frame.add(button, BorderLayout.CENTER);

        CharStream input = CharStreams.fromString(inputField.getText());
        RustLexer lexer = new RustLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RustParser parser = new RustParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener());

        button.addActionListener(e -> {
            outputField.setText(parser.start().toString());
        });

        PrintStream printStream = new PrintStream(new CustomOutputStream(outputField));
        System.setOut(printStream);
        System.setErr(printStream);

        frame.setSize(400,130);
        frame.setVisible(true);
    }
}
