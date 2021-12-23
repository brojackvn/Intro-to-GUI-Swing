package Components;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\thumbs.png").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        label.setIcon(image);
        label.setBounds(150,220,100,100);
        label.setVisible(false);
        // JButton = a button that performs an action when clicked on
        JButton button = new JButton();
        button.setBounds(100,100,200,100);
        button.setSize(200,100);
        button.setText("CLICK HERE");
        button.setFocusable(false);
        button.setIcon(new ImageIcon(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\point.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT)));
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("MV Boli", Font.BOLD,17));
        button.setForeground(Color.red);
        button.setBackground(Color.CYAN);
        button.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button){
//                    System.out.println("Hello World!!!");
//                    button.setEnabled(false);
                    label.setVisible(!label.isVisible());
                }
            }
        });
        MyFrame frame = new MyFrame();
        frame.setSize(430,400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}