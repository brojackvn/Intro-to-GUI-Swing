package Components;

import Components.MyFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(new Color(0x23fbf8), 3);
        JLabel label = new JLabel();
        label.setText("Bro, Do you even code?");
        label.setIcon(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logoLabel.png"));
        label.setHorizontalTextPosition(JLabel.CENTER); // Sets text LEFT,RIGHT,CENTER,... of image icon
        label.setVerticalTextPosition(JLabel.TOP); // Sets text TOP,CENTER,BOTTOM,... of image icon
        label.setForeground(new Color(0x23fbf8));
        label.setFont(new Font("MV Boli", Font.PLAIN, 17)); // Set font of text
        label.setIconTextGap(10); // Set gap of text to image
        label.setBackground(new Color(0x181818)); // Set Background color
        label.setOpaque(true); // Display background color
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER); // Set horizontal position of icon+text within label
        label.setVerticalAlignment(JLabel.CENTER); // Set vertical position of icon+text within label
        //label.setBounds(60,50, 250,250); // Set x,y position within frame as well as dimensions

        JFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400,400);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}