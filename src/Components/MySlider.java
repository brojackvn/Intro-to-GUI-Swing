package Components;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MySlider extends JFrame implements ChangeListener {
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JSlider slider = new JSlider(0,100,50); // min, max, starting point of slider

    public MySlider(){
        this.setBounds(700,100,420,420);

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true); // Nếu false thì vạch chia biến mất
        slider.setMinorTickSpacing(5);

        slider.setPaintTrack(true); // This is slider. Nếu false: thì thanh biến mất
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText("ºC = " + slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        panel.add(slider);
        panel.add(label);
        this.getContentPane().add(panel);
        this.setTitle("GUI SWING"); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: exit out of application  // HIDE_ON_CLOSE: Close the app but run background  // DO_NOTHING_ON_CLOSE: literal
        this.setResizable(false); // False: prevent frame from being resized
        this.setIconImage(new ImageIcon("D:\\Programming language\\Java\\GUI Swing\\src\\Image\\logo.jpg").getImage());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MySlider();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            label.setText("ºC = " + slider.getValue());
        }
    }
}
