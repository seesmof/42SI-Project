import javax.swing.*;
import java.awt.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.RustLexer;
import gen.RustParser;

public class Main extends JFrame {
    private JTextArea inputArea;
    private JTextArea outputArea;

    public Main() {
        setTitle("ANTLR Parser IDE");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputArea = new JTextArea();
        inputArea.setFont(new Font("Consolas", Font.PLAIN, 14));

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setBackground(new Color(240, 240, 240));

        JButton runButton = new JButton("Run Parser");
        runButton.addActionListener(e -> runParser());

        add(new JScrollPane(inputArea), BorderLayout.CENTER);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);
        add(runButton, BorderLayout.NORTH);

        outputArea.setPreferredSize(new Dimension(800, 150));
    }

    private void runParser() {
        try {
            String code = inputArea.getText();
            CharStream input = CharStreams.fromString(code);
            RustLexer lexer = new RustLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RustParser parser = new RustParser(tokens);

            ParseTree tree = parser.start();

            outputArea.setText("Success!\nAST Tre: " + tree.toStringTree(parser));
            outputArea.setForeground(Color.BLACK);
        } catch ( Exception exception) {
            outputArea.setText("Error!\n" + exception.getMessage());
            outputArea.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}