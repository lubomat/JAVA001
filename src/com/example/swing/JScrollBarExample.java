package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBarExample extends JFrame {
    public static void main(String[] args) {

        JScrollBarExample frame = new JScrollBarExample();

        JScrollBar scrol1 = new JScrollBar(Adjustable.HORIZONTAL);
        scrol1.setValue(20);
        scrol1.setMinimum(0);
        scrol1.setMaximum(100);
       // scrol1.setPreferredSize(new Dimension(35,170));
        scrol1.setPreferredSize(new Dimension(180,30));


        scrol1.addAdjustmentListener(
                new AdjustmentListener() {
                    @Override
                    public void adjustmentValueChanged(AdjustmentEvent e) {
                        if(e.getValueIsAdjusting() ) return;
                        System.out.println("scroll value: " + e.getValue());
                    }
                }
        );

        frame.add(scrol1);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
