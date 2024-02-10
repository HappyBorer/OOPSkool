package OOP.Task1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

public class PaintPicture {
    public static void gui(){
        JFrame frame = new JFrame("Picture");
        frame.setSize(new Dimension(400, 440));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            Image image = new ImageIcon("src/OOP/Task1/image_02.png").getImage();

            public void paint(Graphics g){

                g.drawImage(image, 0, 0, null);
                g.setColor(new Color(2, 49, 94));
                g.fillRect(276, 0, 124, 70);
                g.setColor(new Color(0, 69, 126));
                g.fillRect(276, 83, 124, 70);
                g.setColor(new Color(47, 112, 175));
                g.fillRect(276, 165, 124, 70);
                g.setColor(new Color(185, 132, 140));
                g.fillRect(276, 248, 124, 70);
                g.setColor(new Color(128, 100, 145));
                g.fillRect(276, 330, 124, 70);
            }

        };
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        gui();
    }
}
