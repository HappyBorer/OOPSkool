package OOP.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Moving {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }

}
class MyFrame extends JFrame{
    MyFrame(){
        setTitle("Moving");
        setSize(new Dimension(800, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}
class MyPanel extends JPanel{
    private int x = 375;
    private int y = 275;
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
                if(x < 730) {
                    x += step;
                }
            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT){
                if(x > 0){
                    x -= step;
                }
            }
            if(e.getKeyCode() == KeyEvent.VK_UP){
                if(y > -50){
                    y -= step;
                }else{
                    y = 460;
                }
            }
            if(e.getKeyCode() == KeyEvent.VK_DOWN){
                if(y < 460){
                    y += step;
                }else{
                    y = -50;
                }
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}

