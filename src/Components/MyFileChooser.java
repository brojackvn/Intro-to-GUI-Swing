package Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFileChooser extends JFrame implements ActionListener {
    JButton selectFile = new JButton("Select a File");

    public MyFileChooser() {
        this.setLayout(new FlowLayout());

        selectFile.addActionListener(this);

        this.add(selectFile);
        this.setLocation(400,150);
        this.setTitle("GUI SWING"); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFileChooser myFileChooser = new MyFileChooser();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectFile) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("D:\\"));
//            int response = fileChooser.showOpenDialog(null); // Select file to open
//            System.out.println(fileChooser.showOpenDialog(null)); // open: = 0; cancel = 1
//            if (response == JFileChooser.APPROVE_OPTION) {
//                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
//                System.out.println(file);
//            }

            int response1 = fileChooser.showSaveDialog(null); // Select file to save
            System.out.println(fileChooser.showSaveDialog(null)); // if save = 0; cancel = 1


        }
    }
}
