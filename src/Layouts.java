import javax.swing.*;
import java.awt.*;

public class Layouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextArea input = new JTextArea("Коли ти, бувши юдеєм, живеш по-поганському, а не по-юдейському, то як ти можеш силувати поган, щоб жили по-юдейському?\n" +
                "Ми — уроджені юдеї, не з отих грішників поган;\n" +
                "а довідавшися, що людина оправдується не ділами закону, а через віру в Ісуса Христа, ми й увірували в Христа Ісуса, щоб оправдатися нам вірою в Христа, а не ділами закону; бо ніхто не оправдається ділами закону.\n" +
                "Коли ж, шукаючи оправдання у Христі, виявилося, що й ми самі грішники, — то невже Христос — служитель гріха? Жадним робом!\n" +
                "Бо коли я знову відбудовую те, що зруйнував був, то я себе самого оголошую переступником.\n" +
                "Я бо через закон для закону вмер, щоб для Бога жити: я — розп'ятий з Христом.\n" +
                "Живу вже не я, а живе Христос у мені. А що живу тепер у тілі, то живу вірою в Божого Сина, який полюбив мене й видав себе за мене.\n" +
                "Я не відкидаю Божої благодаті: бо коли законом оправдання, то тоді Христос умер даремно.");
        JButton button = new JButton("Analyze");
        JTextArea output = new JTextArea();

        button.addActionListener(e -> {
            output.setText(input.getText());
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        panel.add(input);
        JScrollPane inputScroll = new JScrollPane(input);
        panel.add(inputScroll);
        panel.add(button);
        panel.add(output);
        JScrollPane outputScroll = new JScrollPane(output);
        panel.add(outputScroll);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}