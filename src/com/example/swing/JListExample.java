package com.example.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class JListExample extends JFrame {
    public static void main(String[] args) {

        JListExample frame = new JListExample();

        DefaultListModel<String> df = new DefaultListModel<>();
        df.addElement("Java");
        df.addElement("C++");
        df.addElement("Phyton");
        df.addElement("JavaScript");

        JList<String> list = new JList<>(df);

        list.addListSelectionListener(new ListSelectionListener() {    // co dokladnie zostalo zaznaczone (info)
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) return;    // aby nie bylo podwojnej informacji o zaznaczeniu
                int indices[] = list.getSelectedIndices();
                Arrays.stream(indices).forEach(i -> System.out.println( list.getModel().getElementAt(i) ));

            }
        });

        frame.add(list);



        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
