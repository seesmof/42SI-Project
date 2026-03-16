import gen.RustLexer;
import gen.RustParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.TokenStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Tree {
    public static void main(String args[]) {
        String input = "fn main() {\n  let y = 10;\n}";
        RustLexer lexer = new RustLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RustParser parser = new RustParser(tokens);
        ParseTree tree = parser.start();
        System.out.println(tree.toStringTree(parser));

        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.setScale(1.5);
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
