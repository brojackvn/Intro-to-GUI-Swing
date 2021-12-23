package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyMouseMotionListener {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public MyMouseMotionListener() {
        prepareGUI();
    }

    public static void main(String[] args) {
        new MyMouseMotionListener().showMouseMotionListenerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(450, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setLocation(400,75);
        headerLabel = new JLabel("", JLabel.CENTER);

        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);

        mainFrame.setVisible(true);
        mainFrame.setTitle("Ví dụ MouseMotionListener trong Java Swing");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void showMouseMotionListenerDemo() {
        headerLabel.setText("Listener in action: MouseMotionListener");
        //headerLabel.addMouseMotionListener(new CustomMouseMotionListener());

        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());
        panel.addMouseMotionListener(new CustomMouseMotionListener());
        JLabel msglabel = new JLabel("Huong dan Java Swing.", JLabel.CENTER);
        panel.add(msglabel);
        controlPanel.add(panel);

        mainFrame.setVisible(true);
    }

    private class CustomMouseMotionListener implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            statusLabel.setText("Mouse Dragged: "
                    + "(" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseMoved(MouseEvent e) {
            statusLabel.setText("Mouse Moved: "
                    + "(" + e.getX() + ", " + e.getY() + ")");
        }
    }
}
