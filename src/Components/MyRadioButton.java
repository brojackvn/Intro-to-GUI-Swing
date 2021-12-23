package Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButton extends JFrame implements ActionListener {
    JRadioButton pizzaButton = new JRadioButton("Pizza");
    JRadioButton hamburgerButton = new JRadioButton("Hamburger");
    JRadioButton hotdogButton = new JRadioButton("Hotdog");

    ImageIcon pizzaIcon = new ImageIcon(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\pizza.png").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
    ImageIcon hamburgerIcon = new ImageIcon(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\hamburger.png").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
    ImageIcon hotdogIcon = new ImageIcon(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\hotdog.png").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));

    public MyRadioButton() {
        this.setLayout(new FlowLayout());
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.getContentPane().add(pizzaButton);
        this.getContentPane().add(hamburgerButton);
        this.getContentPane().add(hotdogButton);

        this.setTitle("GUI SWING"); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        //this.getContentPane().setBackground(new Color(0xFFFFFF)); // Change color of background by hexa,rgb,Color.green
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyRadioButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You're ordered Pizza");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You're ordered Hamburger");
        } else {
            System.out.println("You're ordered Hotdog");
        }
    }
}
