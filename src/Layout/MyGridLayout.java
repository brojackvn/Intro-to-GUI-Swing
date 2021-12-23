package Layout;

import Components.MyFrame;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for component within a container

        // GridLayout = places container in a grid of cells
        //              each component takes all the available space within its cell
        //              and each cell is the same size

        MyFrame frame = new MyFrame();
        frame.setLayout(new GridLayout(3,3,10,10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));

        frame.setVisible(true);
    }
}
