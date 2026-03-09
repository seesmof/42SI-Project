import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.RustLexer;
import gen.RustParser;

public class Main {
    public static String appName = "42SI.1 Text Editor";

    public static void main(String[] args) {
        JFrame frame = new JFrame(appName);

        JTextArea inputField = new JTextArea();
        JTextArea outputField = new JTextArea();

        frame.add(inputField, BorderLayout.NORTH);
        frame.add(outputField, BorderLayout.SOUTH);
        outputField.setEditable(false);

        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setVisible(true);

        inputField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                outputField.setText(inputField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                outputField.setText(inputField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                outputField.setText(inputField.getText());
            }
        });
    }
}
