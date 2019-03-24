import javax.swing.*;
import java.awt.*;

public class ScrollBar {
    ScrollBar(){
        JFrame jframe = new JFrame("Scroll bar");
        jframe.setSize(200,300);
        jframe.setLayout(new FlowLayout());

        JButton a = new JButton("a");
        JButton b = new JButton(" b");

        JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jframe.add(a);
        jframe.add(b);
        jframe.setContentPane(pane);

        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new ScrollBar();
    }
}
