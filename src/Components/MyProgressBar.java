package Components;

import javax.swing.*;
import java.awt.*;

public class MyProgressBar extends JFrame {
    JProgressBar progressBar = new JProgressBar(0,500);

    public MyProgressBar(){
        this.setLayout(null);
        this.setBounds(700,100,420,420);

        progressBar.setValue(0);
        progressBar.setBounds(0,0,420,50);
        progressBar.setStringPainted(true);  // Display the percent in Progress Bar
        progressBar.setFont(new Font("MV Boli", Font.BOLD, 25));
        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.BLACK);

        this.getContentPane().add(progressBar);
        this.setTitle("GUI SWING"); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 500;

        while (counter >= 0) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter -= 1;
        }
        progressBar.setString("DONE!");
    }

    public static void main(String[] args) {
        new MyProgressBar();
    }
}
