import gen.RustLexer;
import org.antlr.v4.runtime.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.nio.file.Files;

public class Main {
    public static String appName = "Rust Lexical Analyzer";

    public static void main(String[] args) {
        JFrame frame = new JFrame(appName);
        JTextArea inputField = new JTextArea("fn main() {\n  let x = 10;\n  vec![\"Hello\", 42];\n}");
        JTextArea outputField = new JTextArea();
        JButton analyze = new JButton("Analyze");
        JButton upload = new JButton("Upload File");

        // Панель для кнопок
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(upload);
        panel.add(analyze);

        // Налаштування вигляду
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(inputField), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);

        outputField.setEditable(false);
        outputField.setBackground(new Color(240, 240, 240));
        JScrollPane outputScroll = new JScrollPane(outputField);
        outputScroll.setPreferredSize(new Dimension(400, 150));
        frame.add(outputScroll, BorderLayout.SOUTH);

        // Логіка кнопки "Analyze"
        analyze.addActionListener(e -> {
            outputField.setText("");
            String code = inputField.getText();

            // 1. Створення лексера
            RustLexer lexer = new RustLexer(CharStreams.fromString(code));

            // 2. Перехоплення помилок
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    outputField.append("[ERROR] Line " + line + ":" + charPositionInLine + " - " + msg + "\n");
                }
            });

            // 3. Перебір токенів
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            try {
                tokens.fill();
                for (Token t : tokens.getTokens()) {
                    if (t.getType() == Token.EOF) break;
                    String type = RustLexer.VOCABULARY.getSymbolicName(t.getType());
                    outputField.append(type + " -> '" + t.getText() + "'\n");
                }
            } catch (Exception ex) {
                outputField.append("Analysis failed: " + ex.getMessage());
            }
        });

        // Логіка кнопки "Upload"
        upload.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                try {
                    File selectedFile = chooser.getSelectedFile();
                    inputField.setText(Files.readString(selectedFile.toPath()));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error loading file!");
                }
            }
        });

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}