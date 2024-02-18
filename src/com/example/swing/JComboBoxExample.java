package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComboBoxExample extends JFrame {
    public static void main(String[] args) {

        JComboBoxExample frame = new JComboBoxExample();

        String prog[] = {"Java","C++","JavaScript","Phyton","PHP"};
        JComboBox<String> cb = new JComboBox<>(prog);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("selected: " + prog[cb.getSelectedIndex()] );
            }
        });

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {  // bedzie wywołana 2x jak uzytkownik wybierze jakis element bo moze byc zaznaczony i odznaczony(2 akcje)
                int state = e.getStateChange();
                if(state == ItemEvent.SELECTED) {
                    System.out.println(e.getItem() + " selectedd");
                }else if( state == ItemEvent.DESELECTED) {
                    System.out.println(e.getItem() + "Deselected");
                }
            }
        });

        frame.add(cb);



        frame.setLayout(new FlowLayout());

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
