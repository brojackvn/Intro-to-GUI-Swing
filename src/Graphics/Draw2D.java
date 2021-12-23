package Graphics;

import javax.swing.*;
import java.awt.*;

public class Draw2D extends JFrame {
    MyPanel myPanel = new MyPanel();
    public Draw2D() {
        this.getContentPane().add(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Draw2D();
    }

}
