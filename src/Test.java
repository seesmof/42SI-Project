import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        String path = "sample.rs";
        Path pathAbsolute = Paths.get(path);
        Path pathBase = Paths.get("Rust.g4");
        Path pathRelative = pathBase.relativize(pathAbsolute);
        System.out.println(pathRelative.toString());
    }
}
