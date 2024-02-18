package OOP.Task1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseListen {
    public static void main(String[] args) {
        My_Frame frame = new My_Frame();
        frame.setVisible(true);
    }

    static class My_Frame extends JFrame{
        My_Frame(){
            setTitle("Mouse");
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            setBounds(dimension.width/2-250, dimension.height/2 -250, 600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            My_Panel panel = new My_Panel();
            Container container = getContentPane();
            container.add(panel);
        }
    }

    static class My_Panel extends JPanel{
        private int x  = -1;
        private int y  = -1;
        private int width = 50;
        private int height = 50;

        My_Panel(){
            MyMouse mouse = new MyMouse();
            addMouseListener(mouse);
            setFocusable(true);
        }

        public void paint(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            if(x != -1 && y != -1) {
                g2.fillRect(x, y, width, height);
            }
            repaint();
        }
        class MyMouse implements MouseListener {

            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX() - 25;
                y = e.getY() - 25;
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }

    }

}
