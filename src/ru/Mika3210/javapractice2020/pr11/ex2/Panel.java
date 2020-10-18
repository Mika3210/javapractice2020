package ru.Mika3210.javapractice2020.pr11.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame {
    public Panel(){
        JFrame panel = new JFrame("Панель");
        JButton but1 = new JButton("North");
        JButton but2 = new JButton("West");
        JButton but3 = new JButton("Center");
        JButton but4 = new JButton("East");
        JButton but5 = new JButton("South");
        panel.setLayout(null);
        panel.setSize(800,600);
        panel.setVisible(true);
        panel.setLocationRelativeTo(null);
        but1.setBounds(150,100,500,100);
        panel.add(but1);
        but2.setBounds(500,200,150,100);
        panel.add(but2);
        but3.setBounds(300,200,200,100);
        panel.add(but3);
        but4.setBounds(150,200,150,100);
        panel.add(but4);
        but5.setBounds(150,300,500,100);
        panel.add(but5);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в САО");
            }
        };
        but1.addActionListener(actionListener);
        ActionListener actionListener_2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЗАО");
            }
        };
        but2.addActionListener(actionListener_2);
        ActionListener actionListener_3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЦАО");
            }
        };
        but3.addActionListener(actionListener_3);
        ActionListener actionListener_4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в СВАО");
            }
        };
        but4.addActionListener(actionListener_4);
        ActionListener actionListener_5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЮЗАО");
            }
        };
        but5.addActionListener(actionListener_5);
    }
}