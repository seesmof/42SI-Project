import javax.swing.*;
import java.awt.*;

void main() {
    CharStream stream = new ANTLRInputStream("Jesus is LORD");
    HelloLexer lexer = new HelloLexer(stream);
    TokenStream tokenStream = new CommonTokenStream(lexer);
    HelloParser parser = new HelloParser(tokenStream);
    ParseTree tree = parser.r();

    System.out.println(tree.toStringTree(parser));

    JFrame frame = new JFrame();
    JTextArea textArea = new JTextArea();
    textArea.setBounds(10, 10, 465, 440);
    frame.add(textArea);

    frame.setSize(500, 500);
    frame.setLayout(null);
    frame.setResizable(false);
    frame.setVisible(true);
}