package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\smile.png");
    ImageIcon nervous = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\nervous.png");
    ImageIcon pain = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\pain.png");
    ImageIcon dizzy = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\dizzy.png");

    public MyMouseListener() {
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.setIcon(smile);
        label.addMouseListener(this);
        //this.addMouseListener(this);

        this.getContentPane().add(label);
        this.setBounds(400,50,580, 580);
        this.setTitle("GUI SWING"); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyMouseListener();
    }

    @Override
    public void mouseClicked(MouseEvent e) { // Invoked when a mouse button has been clicked (pressed and released) on a component
        label.setIcon(pain);
    }

    @Override
    public void mousePressed(MouseEvent e) { // Invoked when a mouse button has pressed on a component
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) { // Invoked when a mouse button has released on a component
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) { // Invoked when a mouse button enters a component
        label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {  // Invoked when a mouse button exits a component
        label.setIcon(smile);
    }
}
