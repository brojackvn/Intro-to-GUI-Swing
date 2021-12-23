package Components;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    public MyFrame() {
        // Attribute
        this.setLocation(400,100);
        this.setSize(500,500); // Sets size of frame (width,height)
        this.setTitle("GUI SWING"); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        this.getContentPane().setBackground(new Color(0xFFFFFF)); // Change color of background by hexa,rgb,Color.green

        // Icon
        //ImageIcon imageIcon = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg");
        //frame.setIconImage(imageIcon.getImage());

        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.setVisible(false);
    }
}
