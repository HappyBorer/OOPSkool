package OOP.Task1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Moving {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
    static class MyFrame extends JFrame{
        MyFrame(){
            setTitle("Moving");
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            MyPanel panel = new MyPanel();
            Container pane = getContentPane();
            pane.add(panel);
        }
    }
    static class MyPanel extends JPanel{
        private int x = MyFrame.WIDTH + 270;
        private int y = MyFrame.HEIGHT + 150;
        private int width = 50;
        private int height = 50;
        private int step = 1;

        public MyPanel(){
            MyKey key = new MyKey();
            addKeyListener(key);
            setFocusable(true);
        }
        public void paint(Graphics g){
            super.paint(g);
            g.fillRect(x, y, width, height);
            repaint();
        }
        class MyKey implements KeyListener {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    if(x < 600 - width - 16) {
                        x += step;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    if(x > 0){
                        x -= step;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    if(y > -height + 2){
                        y -= step;
                    }else{
                        y = 360 ;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    if(y < 400 - height + 10){
                        y += step;
                    }else{
                        y = -height;
                    }
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        }
    }



}
