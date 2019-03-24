import javax.swing.*;
import java.awt.*;

public class MyMenu {
    MyMenu(){
        JFrame jframe = new JFrame("Menu Example");
        jframe.setSize(400,400);
        jframe.setLayout(new FlowLayout(FlowLayout.LEFT));

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenuItem save = new JMenuItem("Save");
        file.add(save);
        JMenu options = new JMenu("Options");
        file.add(options);
        JMenuItem tool = new JMenuItem("Tool");
        options.add(tool);
        JMenuItem close = new JMenuItem("Close");
        file.add(close);

        jframe.add(menuBar);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }

    public static void main(String[] args){
        new MyMenu();
    }
}
