package OOP.Task1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramLog {
    static MyFrame frame;
    public static void main(String[] args) {
        frame = new MyFrame();
        frame.setVisible(true);

    }
    static class MyFrame extends JFrame{
        MyFrame(){
            JFrame frame = new JFrame("My program is login");
            setSize(800, 600);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridBagLayout());

            MyPanel panel = new MyPanel();
            Container container = getContentPane();
            container.add(panel);
        }
    }
    static class MyPanel extends JPanel{

        public MyPanel (){
            JLabel label = new JLabel("Login");
            add(label);
            JTextField textField1 = new JTextField(15);
            add(textField1);
            JLabel label2 = new JLabel("Password");
            add(label2);
            TextField textField2 = new TextField(15);
            add(textField2);
            JLabel label3 = new JLabel("Repeat password");
            add(label3);
            TextField textField3 = new TextField(15);
            add(textField3);
            JButton button1 = new JButton("next");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(textField1.getText().length() < 4) {
                        JOptionPane.showMessageDialog(frame, "Длина логина должна быть больше 4 символов", "Внимание!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }


                    if(Character.isDigit(textField1.getText().charAt(0) )){

                        JOptionPane.showMessageDialog(frame,"Логин не должен начинатся с цифры", "Внимание!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    for (int i = 0; i < textField2.getText().length(); i++) {


                        if (Character.isSpaceChar(textField2.getText().charAt(i))) {
                            JOptionPane.showMessageDialog(frame, "Пароль не должен содержать пробелы", "Внимание!", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }


                    if(textField2.getText().length() < 8){
                        JOptionPane.showMessageDialog(frame,"Длина пароля должна быть больше 8 символов", "Внимание!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if(!textField2.getText().equals(textField3.getText())){
                        JOptionPane.showMessageDialog(frame,"Пароль не своподает", "Внимание!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    JOptionPane.showMessageDialog(frame,"Регистрация прошла успешно");
                }
            });
            add(button1);
            revalidate();
        }

    }
}
