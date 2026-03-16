import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public
class FileReader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Open");
        JTextArea textArea = new JTextArea();

        button.addActionListener(new ActionListener() {
            @Override
            public
            void actionPerformed(ActionEvent e) {
                String filePath = "D:\\University-Universytet\\42SI Stvorennja IDE\\source";
                JFileChooser chooser = new JFileChooser(filePath);
                int returnedValue = chooser.showOpenDialog(frame);

                if (returnedValue == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    System.out.println(file.getPath());

                    try {
                        FileReader fileReader = new FileReader();
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                    }
                }
            }
        });

        frame.setLayout(new GridLayout(2,1));
        frame.add(button);
        frame.add(textArea);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
