package Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyComboBox extends JFrame implements ItemListener, ActionListener {
    String[] animals = {"dog", "cat", "bird"};

    JComboBox<String> comboBox = new JComboBox(animals);

    public MyComboBox() {
        this.setLayout(new FlowLayout());

        comboBox.setEditable(false);
        System.out.println(comboBox.getItemCount()); // The amout of selection/comboBox
        comboBox.addItem("pig");
        comboBox.insertItemAt("elephent", 2);
        comboBox.setSelectedItem(1);
        comboBox.removeItem("pig");
        comboBox.removeItemAt(1);
        //comboBox.removeAllItems();
        comboBox.addActionListener(this);

        this.getContentPane().add(comboBox);
        this.setLocation(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("111");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) System.out.println(comboBox.getSelectedItem());
    }

    public static void main(String[] args) {
        new MyComboBox();
    }
}