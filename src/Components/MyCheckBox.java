package Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCheckBox extends JFrame implements ActionListener {
    JCheckBox checkBox;
    boolean flag = false;

    public MyCheckBox(){
        this.setLayout(new FlowLayout());

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a Robot");
        checkBox.addActionListener(this);

        this.getContentPane().add(checkBox);
        this.setTitle("GUI SWING"); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        this.getContentPane().setBackground(new Color(0xFFFFFF)); // Change color of background by hexa,rgb,Color.green
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyCheckBox();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkBox) {
            if (flag == false) {
                flag = true;
                checkBox.setText("I'm not a Robot");
            } else {
                checkBox.setText("I'm a Robot");
                flag = false;
            }
        }
    }
}
