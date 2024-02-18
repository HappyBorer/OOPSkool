package OOP.Task1.view;

import javax.swing.*;
import java.awt.*;

public class PaintCircle {
    public static void gui(){
        JFrame frame = new JFrame("Circle");
        frame.setSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            int x = 10;
            int y = 10;
            int width = 50;
            int height = 50;
            int step = 1;
            public void paint(Graphics g){
                super.paint(g);
                g.drawOval(x, y, width, height);
                if(x > 435){
                    step = -1;
                }
                if(x < 0){
                    step = 1;
                }
                x += step;
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                repaint();
            }
        };
        frame.add(panel);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        gui();
    }
}
