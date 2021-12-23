package Graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    ImageIcon img = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\background.jpg");

    public MyPanel() {
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(new ImageIcon(img.getImage().getScaledInstance(500,500,Image.SCALE_SMOOTH)).getImage(),0,0,null);

        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0,0,500,500);

        g2d.setPaint(Color.CYAN);
        g2d.setStroke(new BasicStroke(3));
        //g2d.drawRect(0,0,500,500);
        g2d.fillRect(400,0, 100,200);

        g2d.drawArc(50,50, 200,200,0, 270);
        g2d.fillArc(50,300,200,200,90,135);

        g2d.setPaint(Color.orange);
        g2d.drawOval(100,100,150,300);
        g2d.fillOval(200,200,100,100);

        int[] pointX = {1, 50, 40, 500};
        int[] pointY = {1, 100, 400,40};
        g2d.setPaint(Color.green);
        g2d.drawPolygon(pointX,pointY,4);
        //g2d.fillPolygon(pointX,pointY,4);

        g2d.setPaint(Color.RED);
        g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2d.drawString("U R A WINNER! :D", 50, 50);
    }
}
