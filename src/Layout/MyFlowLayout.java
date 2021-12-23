package Layout;

import Components.MyFrame;

import javax.swing.*;
import java.awt.*;

public class MyFlowLayout {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for component within a container

        // FlowLayout = places components in a row, sized at their preferred size.
        //              If horizontal space in the container is too small
        //              the flowLayout class uses the next available row

        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(250,250));

        frame.add(panel);
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.setVisible(true);
    }
}
