package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MyKeyBindings extends JFrame {
    JLabel label = new JLabel();

    Action upAction = new UpAction();
    Action downAction = new DownAction();
    Action rightAction = new RightAction();
    Action leftAction = new LeftAction();

    public MyKeyBindings() {
        this.setLayout(null);

        label.setBounds(100,100,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "doSomething");
        label.getActionMap().put("doSomething", upAction);
        // giải thích 2 dòng code trên: Phím "lên" (^) sẽ Map (tương ứng) với một hành động (ở đây mình có thể đặt tên bất kỳ)
        // nhưng đễ cho rõ thì nên đặt tên mô tả đúng với hành động đó như những dòng code 30 đến 35
        // Ở dòng code 23 thì Map "doSomething" với một hành động nào đó, vd như trên là Action upAction
        // ngoài ra nó cũng có thể là pressAction, releaseAction, ... (và các cái đó phải là đối tượng javax.swing.Action )
        // Chú ý: upAction là một đối tượng kế thừa hoặc implement từ Action và trong nó phải Override ActionPerformed

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        // Đây là một VD nhằm mục đích hiểu rõ hơn
        label.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "doSome");
        label.getActionMap().put("doSome", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("EXAMPLE");
            }
        });


        this.getContentPane().add(label);
        this.setBounds(400,75,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Key Bindings");
        this.setResizable(false);
        this.setVisible(true);
    }


    private class UpAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);
        }
    }

    private class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);
        }
    }

    private class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }

    private class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }

    public static void main(String[] args) {
        new MyKeyBindings();
    }
}
