package Layout;

import Components.MyFrame;

import javax.swing.*;
import java.awt.*;

public class MyJLayeredPane {
    public static void main(String[] args) {
        // JLayeredPane = Swing container that provides a third dimension for positioning component
        // ex: depth, Z-index

        MyFrame frame = new MyFrame();
        frame.setLayout(null);

        JLabel labelRed = new JLabel();
        labelRed.setBackground(Color.red);
        labelRed.setOpaque(true);
        labelRed.setBounds(50,50,200,200);

        JLabel labelGreen = new JLabel();
        labelGreen.setBackground(Color.green);
        labelGreen.setOpaque(true);
        labelGreen.setBounds(100,100,200,200);

        JLabel labelBlue = new JLabel();
        labelBlue.setBackground(Color.blue);
        labelBlue.setOpaque(true);
        labelBlue.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        //Sắp xếp sâu nhất: DEFAULT_LAYER -> PALETTE_LAYER -> MODAL_LAYER -> POPUP_LAYER -> DRAG_LAYER
        layeredPane.add(labelRed, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(labelGreen,JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(labelBlue,JLayeredPane.MODAL_LAYER);
        frame.add(layeredPane);

        // Chưa hiểu sự khác nhau giữa 2 code: code trên - code dưới ?.
/*
        labelRed.setVisible(false);
        frame.add(labelRed);
        frame.add(labelGreen);
        frame.add(labelBlue);
    */
        frame.setVisible(true);
    }
}
