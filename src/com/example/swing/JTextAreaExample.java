package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaExample extends JFrame {
    public static void main(String[] args) {

        JTextAreaExample frame = new JTextAreaExample();

        JTextArea t = new JTextArea(7,14);
        JScrollPane pane = new JScrollPane(t);

        t.append("Lorem ipsum");
        t.append(" and other text");
        t.insert("Hello world", 0);
        t.setLineWrap(true);  // tekst automatycznie zawijany

        t.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insertEupdate: " + t.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("removeUpdate: " + t.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("changeUpdate " + t.getText());
            }
        });

        frame.add(pane);

        frame.add(t);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
