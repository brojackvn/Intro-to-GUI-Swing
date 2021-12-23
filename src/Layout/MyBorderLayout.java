package Layout;

import Components.MyFrame;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayout {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for component within a container
        // Border Layout = A BorderLayout places components in five areas: NORHT, SOUTH, WEST, EAST, CENTER
        //                 All extra space is placed in the center area

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.ORANGE);
        panel4.setBackground(Color.RED);
        panel5.setBackground(Color.PINK);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        /*------ sub panels of panel1 -----*/
        JPanel panel11 = new JPanel();
        JPanel panel12 = new JPanel();

        panel11.setBackground(Color.LIGHT_GRAY);
        panel12.setBackground(Color.BLACK);

        panel11.setPreferredSize(new Dimension(100, 150));
        panel12.setPreferredSize(new Dimension(100, 150));

        panel1.setLayout(new BorderLayout(5,5));
        panel1.add(panel11, BorderLayout.NORTH);
        panel1.add(panel12, BorderLayout.SOUTH);
        //--------------------------

        MyFrame frame = new MyFrame();
        frame.setLayout(new BorderLayout(10,10));
        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.NORTH);
        frame.add(panel5, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
