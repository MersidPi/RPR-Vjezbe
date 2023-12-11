package com.example.rpr21tutorijal6;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btn0;

    @FXML
    private Button modBtn;

    @FXML
    private Button timesBtn;

    @FXML
    private Button plusBtn;

    @FXML
    private Button minusBtn;

    @FXML
    private Button divideBtn;

    @FXML
    private Button dotBtn;

    @FXML
    private Button equalsBtn;

    @FXML
    private TextField display;
    private Double result = 0d;
    private int operation = -1;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btn1) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "1");
        } else if (event.getSource() == btn2) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "2");
        } else if (event.getSource() == btn3) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "3");
        } else if (event.getSource() == btn4) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "4");
        } else if (event.getSource() == btn5) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "5");
        } else if (event.getSource() == btn6) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "6");
        } else if (event.getSource() == btn7) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "7");
        } else if (event.getSource() == btn8) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "8");
        } else if (event.getSource() == btn9) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "9");
        } else if (event.getSource() == btn0) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + "0");
        } else if (event.getSource() == dotBtn) {
            if (operation == 0) {
                display.setText("");
                operation = -1;
            }
            display.setText(display.getText() + ".");
        } else if (event.getSource() == equalsBtn) {
            double operand = Double.parseDouble(display.getText());
            if (operation == 1) {
                result += operand;
                display.setText(String.valueOf(result));
            } else if (operation == 2) {
                result -= operand;
                display.setText(String.valueOf(result));
            } else if (operation == 3) {
                result *= operand;
                display.setText(String.valueOf(result));
            } else if (operation == 4) {
                result /= operand;
                display.setText(String.valueOf(result));
            } else if (operation == 5) {
                result %= operand;
                display.setText(String.valueOf(result));
            }
            operation = 0;
        } else if (event.getSource() == plusBtn) {
            result = Double.parseDouble(display.getText());
            display.setText("");
            operation = 1;
        } else if (event.getSource() == minusBtn) {
            result = Double.parseDouble(display.getText());
            display.setText("");
            operation = 2;
        } else if (event.getSource() == timesBtn) {
            result = Double.parseDouble(display.getText());
            display.setText("");
            operation = 3;
        } else if (event.getSource() == divideBtn) {
            result = Double.parseDouble(display.getText());
            display.setText("");
            operation = 4;
        } else if (event.getSource() == modBtn) {
            result = Double.parseDouble(display.getText());
            display.setText("");
            operation = 5;
        }
    }
}