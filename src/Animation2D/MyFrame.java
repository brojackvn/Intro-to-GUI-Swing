package Animation2D;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel myPanel = new MyPanel();

    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(myPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
}
