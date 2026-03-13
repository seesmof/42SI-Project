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

        try (Scanner reader = new Scanner(file))     {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
