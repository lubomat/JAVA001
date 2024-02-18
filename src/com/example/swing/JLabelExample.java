package com.example.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelExample extends JFrame {
    public static void main(String[] args) {

        JLabelExample frame = new JLabelExample();

        JLabel label1 = new JLabel("Tekst");
        label1.setText("<html><u>New text<html>");
        label1.setBounds(10,10,80,50);
        label1.setForeground(Color.BLUE);

        label1.setOpaque(true); // jak chcemy ustawic tlo to trzeba pamietac zeby element nie byl przezroczysty
        label1.setBackground(Color.WHITE);
        label1.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.red,3);
        label1.setBorder(border);
        frame.add(label1);


        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
