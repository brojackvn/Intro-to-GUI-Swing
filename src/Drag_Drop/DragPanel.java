package Drag_Drop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon imageIcon = new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logoLabel.png");
    final int WIDTH = imageIcon.getIconWidth();
    final int HEIGHT = imageIcon.getIconHeight();
    Point imageCorner;
    Point prevPoint;
//    JLabel label = new JLabel("Huong dan");

    public DragPanel() {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(600,600));
        imageCorner = new Point(100,100);

//        label.setBounds(0,0,100,100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
//
//        this.add(label);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        imageIcon.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPoint = e.getPoint();
            System.out.println(prevPoint);
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPoint = e.getPoint();
            imageCorner.translate((int) (currentPoint.getX() - prevPoint.getX()), (int) (currentPoint.getY() - prevPoint.getY()));
//            label.setLocation((int) currentPoint.getX(), (int) currentPoint.getY());
            prevPoint = currentPoint;
            repaint();
        }

    }
}
