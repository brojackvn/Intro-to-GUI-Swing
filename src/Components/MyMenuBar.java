package Components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyMenuBar implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    public MyMenuBar() {
        MyFrame myFrame = new MyFrame();

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("Load"); fileMenu.add(loadItem); loadItem.addActionListener(this);
        saveItem = new JMenuItem("Save"); fileMenu.add(saveItem); saveItem.addActionListener(this);
        exitItem = new JMenuItem("Exit"); fileMenu.add(exitItem); exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // press Alt + F for File
        editMenu.setMnemonic(KeyEvent.VK_E); // press Alt + E for Edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // press Alt + H for Help
        loadItem.setMnemonic(KeyEvent.VK_L); // press L for Load
        saveItem.setMnemonic(KeyEvent.VK_S); // press S for Save
        exitItem.setMnemonic(KeyEvent.VK_E); // press E for Exit

        // loadItem.setIcon();
        myFrame.setJMenuBar(menuBar);
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyMenuBar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("LOAD");
        } else if (e.getSource() == saveItem) {
            System.out.println("SAVE");
        } else {
            System.out.println("EXIT");
        }
    }
}
