package OOP.Task1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JButton[] buttons = new JButton[10];
        for(int i = 0; i < buttons.length; i++){
            buttons[i] = new JButton(String.format("%d", i));
        }
        JButton multiplication = new JButton("*");
        JButton division = new JButton("/");
        JButton addition = new JButton("+");
        JButton subtraction = new JButton("-");
        JButton equals = new JButton("=");
        JButton cleaning = new JButton("C");
        JTextField textFieldOne = new JTextField(10);
        textFieldOne.setHorizontalAlignment(JTextField.RIGHT);
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Character> symbol = new ArrayList<>();


        cleaning.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers.clear();
                symbol.clear();
                textFieldOne.setText("");
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"".equals(textFieldOne.getText())) {
                    if(numbers.size() == 0) {
                        numbers.add(Double.parseDouble(textFieldOne.getText()));
                    }else{
                        numbers.add(1, Double.parseDouble(textFieldOne.getText()));
                    }
                    textFieldOne.setText("");
                    symbol.add('*');
                }
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"".equals(textFieldOne.getText())) {
                    if(numbers.size() == 0) {
                        numbers.add(Double.parseDouble(textFieldOne.getText()));
                    }else{
                        numbers.add(1, Double.parseDouble(textFieldOne.getText()));
                    }
                    textFieldOne.setText("");
                    symbol.add('/');
                }

            }
        });
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"".equals(textFieldOne.getText())) {
                    if(numbers.size() == 0) {
                        numbers.add(Double.parseDouble(textFieldOne.getText()));
                    }else{
                        numbers.add(1, Double.parseDouble(textFieldOne.getText()));
                    }
                    textFieldOne.setText("");
                    symbol.add('+');
                }

            }
        });
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"".equals(textFieldOne.getText())) {
                    if(numbers.size() == 0) {
                        numbers.add(Double.parseDouble(textFieldOne.getText()));
                    }else{
                        numbers.add(1, Double.parseDouble(textFieldOne.getText()));
                    }
                    textFieldOne.setText("");
                    symbol.add('-');
                }
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result ;
                numbers.add(Double.parseDouble(textFieldOne.getText()));
                for (int i = 0; i < symbol.size(); i++){
                    switch (symbol.get(i)){
                        case '+':
                            result = numbers.get(0) + numbers.get(1);
                            numbers.remove(0);
                            numbers.remove(0);
                            numbers.add(0, result);
                            break;
                        case '-':
                            result = numbers.get(0) - numbers.get(1);
                            numbers.remove(0);
                            numbers.remove(0);
                            numbers.add(0, result);
                            break;
                        case '*':
                            result = numbers.get(0) * numbers.get(1);
                            numbers.remove(0);
                            numbers.remove(0);
                            numbers.add(0, result);
                            break;
                        case '/':
                            if(numbers.get(1) != 0) {
                                result = numbers.get(0) / numbers.get(1);
                                numbers.remove(0);
                                numbers.remove(0);
                                numbers.add(0, result);
                            }else{
                                textFieldOne.setText("You can’t divide into zero");
                                numbers.clear();
                                return;
                            }
                            break;

                    }
                    symbol.remove(0);
                    i--;
                    textFieldOne.setText(String.valueOf(numbers.get(0)));
                }
            }
        });





        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.add(textFieldOne, new GridBagConstraints(0,0,4,1,0, 0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        for(int i = buttons.length - 1, x = 2, y = 1; i > 0; i--){
            if( x >= 0) {
                panel2.add(buttons[i], new GridBagConstraints(x--, y, 1, 1, 0, 0,
                        GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

            }else{
                i++;
                x = 2;
                y++;
            }

        }
        panel2.add(buttons[0], new GridBagConstraints(0, 4, 1, 1, 0, 0,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        for(JButton button : buttons){
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textFieldOne.setText(textFieldOne.getText() + button.getText());

                }
            });
        }
        panel2.add(multiplication, new GridBagConstraints(3,2,1,1,0, 0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        panel2.add(division, new GridBagConstraints(3,1,1,1,0, 0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        panel2.add(addition, new GridBagConstraints(3,4,1,1,0, 0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        panel2.add(subtraction, new GridBagConstraints(3,3,1,1,0, 0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        panel2.add(equals, new GridBagConstraints(2,4,1,1,0, 0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        panel2.add(cleaning, new GridBagConstraints(1,4,1,1,0, 0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));


        frame.add(panel2);
        frame.revalidate();
        frame.pack();


    }
}
