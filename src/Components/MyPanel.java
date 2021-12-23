package Components;

import javax.swing.*;
import java.awt.*;

public class MyPanel {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon image = new ImageIcon(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\thumbs.png").getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH));

        JLabel label = new JLabel();
        label.setText("There!!!");
        label.setIcon(image);
        label.setSize(100,100);
        label.setVerticalAlignment(JLabel.CENTER); // This something only use in BORDER LAYOUT
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        greenPanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.setVisible(true);
    }
}

