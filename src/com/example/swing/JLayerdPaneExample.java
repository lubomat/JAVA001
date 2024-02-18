package com.example.swing;

import javax.swing.*;
import java.awt.*;

public class JLayerdPaneExample extends JFrame {
    public static void main(String[] args) {

        JLayerdPaneExample frame = new JLayerdPaneExample();

        JLayeredPane layeredPane = frame.getLayeredPane();
        JButton b1 = new JButton();
        b1.setBounds(10,10,50,50);
        b1.setBackground(Color.RED);
        layeredPane.add(b1,10);

        JButton b2 = new JButton();
        b2.setBounds(15,30,50,50);
        b2.setBackground(Color.DARK_GRAY);
        layeredPane.add(b2,10);

        JButton b3 = new JButton();
        b3.setBounds(30,30,60,70);
        b3.setBackground(Color.BLUE);
        layeredPane.add(b3,15);


        frame.setLayout(null);     // null bo uzywamy setBounds
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
