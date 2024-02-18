package com.example.swing;

import javax.swing.*;
import java.awt.*;

public class ToolTipAppIconExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JButton b1 = new JButton("Click Me!");
        b1.setToolTipText("Kliknij Mnie!");

        Image icon = (new ImageIcon("files\\city.jpg")).getImage();
        frame.setIconImage(icon);

        frame.setLayout(new FlowLayout());
        frame.add(b1);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
