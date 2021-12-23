package Drag_Drop;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();
    public MyFrame() {
        //this.setLayout(null);
        this.getContentPane().add(dragPanel);
        this.setBounds(400, 100, 600, 600);
        this.setTitle("Drag & Drop");
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logoLabel.png").getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
