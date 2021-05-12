//package com.swingShristi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First {
    private JButton button_msg;
    private JPanel panelMain;

    public First() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello Swing");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing GUI");
        frame.setContentPane(new First().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
