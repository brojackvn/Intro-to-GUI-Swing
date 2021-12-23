package Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorChooser extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    public MyColorChooser() {
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is some text :)");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.setLocation(400,150);
        this.setTitle("GUI SWING"); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyColorChooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Choose Color", Color.WHITE);
            label.setForeground(color);
        }
    }
}
