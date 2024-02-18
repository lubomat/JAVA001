package com.example.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class JOptionPaneShowMessageDiaglog extends JFrame {
    public static void main(String[] args) {

        JOptionPaneShowMessageDiaglog frame = new JOptionPaneShowMessageDiaglog();


        /*JOptionPane.showMessageDialog(frame,
                "Hello World!",
                "Title",
                JOptionPane.PLAIN_MESSAGE); */

        ImageIcon icon = new ImageIcon("files//city.jpg");

        JOptionPane.showMessageDialog(null,
                "<html><u>Hello World </html>",
                "Title",
                JOptionPane.ERROR_MESSAGE,
                icon);





        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
