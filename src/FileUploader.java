import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public
class FileUploader {
    public static void main(String[] args) {
        String fileName = "D:\\University-Universytet\\42SI Stvorennja IDE\\source\\src\\Rust.g4";
        File file = new File(fileName);
        String s = "";

        try (Scanner reader = new Scanner(file))     {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                s = s + line + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        System.out.println(s);
    }
}
