package Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextField extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    MyTextField() {
        this.setLayout(new FlowLayout());
        button = new JButton("Submit");
        button.addActionListener(this);
        button.setBackground(Color.GREEN);
        button.setForeground(Color.black);
        button.setFont(new Font("Consolas", Font.PLAIN,13));
        button.setFocusable(false);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 30));
        textField.setFont(new Font("Consolas", Font.PLAIN,30));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.GREEN);
        textField.setText("username");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        this.getContentPane().add(button);
        this.getContentPane().add(textField);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyTextField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(textField.getText());
            textField.setEditable(false);
        }
    }
}
