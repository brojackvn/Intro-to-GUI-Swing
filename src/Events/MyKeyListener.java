package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener extends JFrame implements KeyListener {
    JLabel label = new JLabel();
    ImageIcon imageIcon = new ImageIcon(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\rocket.png").getImage().getScaledInstance(64,64, Image.SCALE_SMOOTH));
    public MyKeyListener() {
        this.setLayout(null);

        label.setBounds(0,0,100,100);
        label.setIcon(imageIcon);
        //label.setSize(100,100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);

        this.getContentPane().add(label);
        this.addKeyListener(this);
        this.setBounds(400,50,500,500);
        this.setTitle("GUI SWING"); // Sets title of frame
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyKeyListener();
    }

    @Override
    public void keyTyped(KeyEvent e) { // Invoked when a key is typed. Uses keyChar, char output
        // -------------- NOTE: Use KEYCHAR
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) { // Invoked when a physical key is pressed down. Uses keyCode, int output
        // -------------- NOTE: Use KEYCODE
        switch (e.getKeyCode()) {
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 37:
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY()+10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) { // Called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key Code: " + e.getKeyCode());
    }
}
