import javax.swing.*;
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
        JLabel outputLabel = new JLabel("Text Editor");

        frame.add(inputField, BorderLayout.NORTH);
        frame.add(outputLabel, BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
