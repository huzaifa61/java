import javax.swing.*;
import java.awt.*;

public class IconLabeled {
    IconLabeled(){
        JFrame jframe = new JFrame("Icon Inside label");
        jframe.setSize(200,200);
        jframe.setLayout(new FlowLayout());

        JLabel label = new JLabel("My Nemo");
        ImageIcon image = new ImageIcon("src/Nemo.jpg");
        label.setIcon(image);

        jframe.add(label);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }

    public static void main(String[] args){
        new IconLabeled();
    }
}
