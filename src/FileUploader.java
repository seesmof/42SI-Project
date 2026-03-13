import java.io.Console;
import java.io.File;
import java.io.FileInputStream;

public
class FileUploader {
    public static void main() {
        File file = new File("Rust.g4");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }
        }
    }
}
