package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JMenuBarExample extends JFrame {
    public static void main(String[] args) {

        JMenuBarExample frame = new JMenuBarExample();

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenuItem newFile = new JMenuItem("New");
        file.add(newFile);
        JMenuItem open = new JMenuItem("Open");
        file.add(open);
        JMenuItem close = new JMenuItem("Close");
        file.add(close);


        //submenu
        JMenu latestFiles = new JMenu("Latest");
        JMenuItem file1 = new JMenuItem("File 1");
        latestFiles.add(file1);
        JMenuItem file2 = new JMenuItem("File 2");
        latestFiles.add(file2);
        JMenuItem file3 = new JMenuItem("File 3");
        latestFiles.add(file3);
        file.add(latestFiles);

        JMenu edit = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        edit.add(cut);
        JMenuItem copy = new JMenuItem("Copy");
        edit.add(copy);
        JMenuItem paste = new JMenuItem("Paste");
        edit.add(paste);
        menuBar.add(edit);


        file.addSeparator();
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        frame.setJMenuBar(menuBar);
        JCheckBoxMenuItem checkBox = new JCheckBoxMenuItem("Checkbox");
        file.add(checkBox);

        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("radio1");
        JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("radio2",true);
        JRadioButtonMenuItem radio3 = new JRadioButtonMenuItem("radio3");
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        file.add(radio1);
        file.add(radio2);
        file.add(radio3);


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source.equals(exit)) System.exit(0);

                if(source instanceof JMenuItem) {
                    System.out.println(((JMenuItem) source).getText());
                }

                if(source.equals(checkBox)) {
                    System.out.println("checkbox selected:" + checkBox.isSelected());
                }

                if(source instanceof  JRadioButtonMenuItem) {
                    System.out.println("Selected radio:"
                             + ((JRadioButtonMenuItem)source).getText() );
                }
            }
        };


        checkBox.addActionListener(listener);
        radio1.addActionListener(listener);
        radio2.addActionListener(listener);
        radio3.addActionListener(listener);

        exit.addActionListener(listener);
        newFile.addActionListener(listener);
        open.addActionListener(listener);
        file1.addActionListener(listener);
        file2.addActionListener(listener);
        file3.addActionListener(listener);
        cut.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);


        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
