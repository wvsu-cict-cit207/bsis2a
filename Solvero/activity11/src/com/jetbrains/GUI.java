package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class GUI extends Component {
JButton addButton, diffButton, timesButton, divButton, moduloButton, clearButton;
JTextField num1TF, num2TF;
JLabel label, result, num1Label, num2Label;
    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        label = new JLabel("RESULT:");
        result = new JLabel();
        num1TF = new JTextField();
        num1Label = new JLabel("First Number: ");
        num2TF = new JTextField();
        num2Label = new JLabel("Second Number: ");
        addButton = new JButton(" +");
        diffButton = new JButton(" -");
        timesButton = new JButton(" *");
        divButton = new JButton(" /");
        moduloButton = new JButton(" %");
        clearButton = new JButton(" Clear");

        panel.setBorder(BorderFactory.createEmptyBorder(30,30, 10, 30));
        panel.setLayout(new GridLayout( 0,2));
        panel.add(num1Label);
        panel.add(num1TF);
        panel.add(num2Label);
        panel.add(num2TF);
        panel.add(label);
        panel.add(result);
        panel.add(addButton);
        panel.add(diffButton);
        panel.add(timesButton);
        panel.add(divButton);
        panel.add(moduloButton);
        panel.add(clearButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing Arithmetics");
        frame.pack();
        frame.setVisible(true);

    }

    public void allListeners(ActionListener a){
        addButton.addActionListener(a);
        diffButton.addActionListener(a);
        timesButton.addActionListener(a);
        divButton.addActionListener(a);
        moduloButton.addActionListener(a);
        clearButton.addActionListener(a);

    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
