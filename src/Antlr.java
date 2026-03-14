import gen.RustLexer;
import gen.RustParser;
import org.antlr.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public
class Antlr {
    public static void main(String[] args) {
        String input = "fn main() {\n  let y = 10;\n}";
        RustLexer lexer = new RustLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RustParser parser = new RustParser(tokens);
        ParseTree tree = parser.start();
        System.out.println(tree.toStringTree(parser));
    }
}
