package Animation2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class MyPanel extends JPanel {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image farmer;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
        backgroundImage = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\background_farm.jpg").getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        farmer = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\farmer.png").getImage().getScaledInstance(78,78,Image.SCALE_SMOOTH);
        new javax.swing.Timer(1,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x >= PANEL_WIDTH - farmer.getWidth(null) || x < 0) {
                    xVelocity = xVelocity * (-1);

                }
                if (y >= PANEL_HEIGHT - farmer.getHeight(null) || y < -500) {
                    yVelocity = yVelocity * (-1);
                }
                x = x + xVelocity;
                y = y + yVelocity;
                repaint();
            }
        }).start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(backgroundImage,0,0,null);

        g2d.drawImage(farmer, x,y,null);

    }
}
