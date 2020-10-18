package ru.Mika3210.javapractice2020.pr12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{
    Window() {
        JFrame frame = new JFrame("Притяжение");

        JLabel planet = new JLabel("Планета:");
        planet.setBounds(100, 10, 150, 20);
        planet.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frame.add(planet);

        JLabel attraction = new JLabel("Притяжение планеты:");
        attraction.setBounds(60, 120, 170, 20);
        attraction.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frame.add(attraction);

        JComboBox box = new JComboBox();
        box.setEditable(true);
        box.addItem("Меркурий");
        box.addItem("Венера");
        box.addItem("Земля");
        box.addItem("Марс");
        box.addItem("Юпитер");
        box.addItem("Сатурн");
        box.addItem("Уран");
        box.addItem("Нептун");
        box.setBounds(60, 40, 150, 40);
        frame.add(box);

        JLabel label = new JLabel("3,7 H/кг");
        label.setBounds(100, 140, 150, 40);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frame.add(label);
        frame.setSize(280, 280);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (box.getSelectedIndex()==0)
                    label.setText("3,7 Н/кг");
                if (box.getSelectedIndex()==1)
                    label.setText("8,9 Н/кг");
                if (box.getSelectedIndex()==2)
                    label.setText("9,8 Н/кг");
                if (box.getSelectedIndex()==3)
                    label.setText("3,7 Н/кг");
                if (box.getSelectedIndex()==4)
                    label.setText("24,7 Н/кг");
                if (box.getSelectedIndex()==5)
                    label.setText("9 Н/кг");
                if (box.getSelectedIndex()==6)
                    label.setText("8,7 Н/кг");
                if (box.getSelectedIndex()==7)
                    label.setText("11 Н/кг");
            }
        });
    }
}
