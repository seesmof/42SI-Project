import javax.swing.*;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import gen.RustLexer

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
    RustLexer lexer = new RustLexer(stream);
    CommonTokenStream tokens=new CommonTokenStream(lexer);
    RustLexerParser parser = new RustLexerParser(tokens);

    ParseTree tree= parser.compilationUnit();
    CustomVisitor visitor = new CustomViristor();
    visitor.visit(tree);
}