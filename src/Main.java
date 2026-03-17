import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import gen.RustLexer;
import gen.RustParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static String appName = "42SI.1 Text Editor";

    public static void main(String[] args) {
        String initialText = "fn main() {\n  let x = 10;\n  println!('Jesus is LORD')\n  let y = 30;\n  let abc = 30;\n  for (int i = 0; i <= 10; i++} {\n  println!('Jesus is KING', i)\n}";
        JFrame frame = new JFrame(appName);
        JTextArea inputField = new JTextArea(initialText);
        JTextArea outputField = new JTextArea();
        JButton analyze = new JButton("Analyze");
        JButton upload = new JButton("Upload");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(analyze);
        panel.add(upload);

        frame.setLayout(new GridLayout(3,1));
        frame.add(inputField);
        JScrollPane inputScroll = new JScrollPane(inputField);
        frame.add(inputScroll);
        frame.add(panel);
        frame.add(outputField);
        JScrollPane outputScroll = new JScrollPane(outputField);
        frame.add(outputScroll);
        outputField.setEditable(false);

        analyze.addActionListener(e -> {
            outputField.setText("");
            RustLexer lexer = new RustLexer(CharStreams.fromString(inputField.getText()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RustParser parser = new RustParser(tokens);
            ParseTree tree = parser.start();
            outputField.setText(tree.toStringTree(parser));
        });

        upload.addActionListener(new ActionListener() {
            @Override
            public
            void actionPerformed(ActionEvent e) {
                String initialPath = "D:\\University-Universytet\\42SI Stvorennja IDE\\";
                JFileChooser chooser = new JFileChooser(initialPath);
                int returnedValue = chooser.showOpenDialog(frame);

                if (returnedValue == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    System.out.println(file.getPath());

                    try {
                        FileReader reader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(reader);

                        String string1 = "";
                        StringBuilder string2 = new StringBuilder();

                        while ((string1 = bufferedReader.readLine()) != null) {
                            string2.append(string1).append("\n");
                        }

                        inputField.setText(string2.toString());
                        bufferedReader.close();
                    } catch (IOException fileNotFoundException) {
                        fileNotFoundException.printStackTrace();
                    }
                }
            }
        });

        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
