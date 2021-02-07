package com.jetbrains;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiController {
    GUI gui;
    GuiController(GUI gui){
        this.gui = gui;
        gui.allListeners(new ActionButton());

    }
    class ActionButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                if (actionEvent.getSource() == gui.addButton) {
                    int num1 = Integer.parseInt(gui.num1TF.getText());
                    int num2 = Integer.parseInt(gui.num2TF.getText());
                    int result = GUImodel.addNumbers(num1, num2);
                    gui.result.setText("" + result);
                } else if (actionEvent.getSource() == gui.diffButton) {
                    int num1 = Integer.parseInt(gui.num1TF.getText());
                    int num2 = Integer.parseInt(gui.num2TF.getText());
                    int result = GUImodel.diffNumbers(num1, num2);
                    gui.result.setText("" + result);
                } else if (actionEvent.getSource() == gui.timesButton) {
                    int num1 = Integer.parseInt(gui.num1TF.getText());
                    int num2 = Integer.parseInt(gui.num2TF.getText());
                    int result = GUImodel.timesNumbers(num1, num2);
                    gui.result.setText("" + result);
                } else if (actionEvent.getSource() == gui.divButton) {
                    int num1 = Integer.parseInt(gui.num1TF.getText());
                    int num2 = Integer.parseInt(gui.num2TF.getText());
                    int result = GUImodel.divNumbers(num1, num2);
                    gui.result.setText("" + result);
                } else if (actionEvent.getSource() == gui.moduloButton) {
                    int num1 = Integer.parseInt(gui.num1TF.getText());
                    int num2 = Integer.parseInt(gui.num2TF.getText());
                    int result = GUImodel.moduloNumbers(num1, num2);
                    gui.result.setText("" + result);
                } else if (actionEvent.getSource() == gui.clearButton) {
                    gui.num1TF.setText("");
                    gui.num2TF.setText("");
                    gui.result.setText("");
                }
            } catch(NumberFormatException ex) {
                    System.out.println(ex);
                    gui.displayErrorMessage("You Need to Enter 2 numbers");
                }

            }
        }
    }
