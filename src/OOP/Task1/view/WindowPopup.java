package OOP.Task1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class WindowPopup {
    static My_Frami frami = new My_Frami();
    public static void main(String[] args) {

        frami.setVisible(true);

//        int answer = JOptionPane.showConfirmDialog(frami, "Everything is fine?");
//
//        if (answer == JOptionPane.YES_OPTION) {            // answer = 0
//            System.out.println("Yes");
//        } else if (answer == JOptionPane.NO_OPTION) {      // answer = 1
//            System.out.println("No");
//        } else if (answer == JOptionPane.CANCEL_OPTION) {  // answer = 2
//            System.out.println("No matter");
//        }
    }
     static class My_Frami extends JFrame {
        public My_Frami() {
            setTitle("Test");
            setSize(800, 600);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            New_Panel panel = new New_Panel();
            Container pane1 = getContentPane();
            pane1.add(panel);
        }
    }
    static class New_Panel extends JPanel {
        public New_Panel() {
            Test key = new Test();
            addKeyListener(key);
            setFocusable(true);
        }

        public class Test implements KeyListener {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SPACE){

                    JOptionPane.showMessageDialog(frami,JOptionPane.showInputDialog("Enter name"));
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        }
    }
}
