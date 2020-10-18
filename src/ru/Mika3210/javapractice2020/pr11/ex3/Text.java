package ru.Mika3210.javapractice2020.pr11.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame {
    public Text(){
        JFrame text = new JFrame("Ваш выбор?");

        Label color = new Label("Цвет:");
        color.setBounds(110, 10, 150, 20);
        color.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        text.add(color);

        Label font = new Label("Шрифт:");
        font.setBounds(110,90,150,20);
        font.setFont(new Font("Times New Roman",Font.PLAIN,16));
        text.add(font);

        JComboBox box_1 = new JComboBox();
        box_1.setEditable(true);
        box_1.addItem("Blue");
        box_1.addItem("Red");
        box_1.addItem("Black");
        box_1.setBounds(60, 40, 150, 40);
        text.add(box_1);

        JComboBox box_2 = new JComboBox();
        box_2.setEditable(true);
        box_2.addItem("Times New Roman");
        box_2.addItem("MS Sans Serif");
        box_2.addItem("Courier New");
        box_2.setBounds(60, 120, 150, 40);
        text.add(box_2);

        JTextArea text_area = new JTextArea("Ваш текст здесь", 10,15);
        text_area.setFont(new Font("Times New Roman",Font.PLAIN,16));
        text_area.setBounds(60,170,150,40);

        box_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (box_1.getSelectedIndex()==0)
                    text_area.setForeground(Color.BLUE);
                if (box_1.getSelectedIndex()==1)
                    text_area.setForeground(Color.RED);
                if (box_1.getSelectedIndex()==2)
                    text_area.setForeground(Color.BLACK);
            }
        });

        box_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (box_2.getSelectedIndex()==0)
                    text_area.setFont(new Font("Times New Roman", Font.PLAIN, 16));
                if (box_2.getSelectedIndex()==1)
                    text_area.setFont(new Font("MS Sans Serif", Font.PLAIN, 16));
                if (box_2.getSelectedIndex()==2)
                    text_area.setFont(new Font("Courier New", Font.PLAIN, 16));
            }
        });

        text.add(text_area);
        text.setSize(280,280);
        text.setLayout(null);
        text.setVisible(true);
        text.setLocationRelativeTo(null);
    }
}
