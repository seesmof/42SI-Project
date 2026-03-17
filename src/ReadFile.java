import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public
class ReadFile {
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
                        FileReader reader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(reader);

                        String string1 = "";
                        StringBuilder string2 = new StringBuilder();

                        while ((string1 = bufferedReader.readLine()) != null) {
                            string2 .append(string1).append("\n");
                        }

                        textArea.setText(string2.toString());
                        bufferedReader.close();
                    } catch (IOException fileNotFoundException) {
                        fileNotFoundException.printStackTrace();
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
