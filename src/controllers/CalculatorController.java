package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    @FXML
    private Label message;
    @FXML
    private TextField textField;

    private double number1 = 0;
    private double number2 = 0;
    private int option = 0;
    private double result = 0;

    public void one() {
        System.out.println("u clicked on one BUTTON.");
        textField.appendText("1");

    }

    public void two() {
        System.out.println("u clicked on two BUTTON.");
        textField.appendText("2");
    }

    public void three() {
        System.out.println("u clicked on three BUTTON.");
        textField.appendText("3");
    }

    public void four() {
        System.out.println("u clicked on four BUTTON.");
        textField.appendText("4");
    }

    public void five() {
        System.out.println("u clicked on five BUTTON.");
        textField.appendText("5");

    }

    public void six() {
        System.out.println("u clicked on six BUTTON.");
        textField.appendText("6");

    }

    public void seven() {
        System.out.println("u clicked on seven BUTTON.");
        textField.appendText("7");

    }

    public void eight() {
        System.out.println("u clicked on eight BUTTON.");
        textField.appendText("8");

    }

    public void nine() {
        System.out.println("u clicked on nine BUTTON.");
        textField.appendText("9");

    }

    public void zero() {
        System.out.println("u clicked on zero BUTTON.");
        textField.appendText("0");

    }

    public void divide() {
        System.out.println("u clicked on divide BUTTON.");
        number1 = Double.parseDouble(textField.getText());
        option = 1;
        textField.setText("");
    }

    public void multiply() {
        System.out.println("u clicked on multiply BUTTON.");
        number1 = Double.parseDouble(textField.getText());
        option = 2;
        textField.setText("");
    }

    public void minus() {
        System.out.println("u clicked on minus BUTTON.");
        if (textField.getText().isEmpty()) {
            textField.setText("-");
        } else {
            number1 = Double.parseDouble(textField.getText());
            option = 3;
            textField.setText("");
        }
    }

    public void plus() {
        System.out.println("u clicked on plus BUTTON.");
        number1 = Double.parseDouble(textField.getText());
        option = 4;
        textField.setText("");

    }

    public void dot(){
        System.out.println("u clicked on dot BUTTON");
        if (textField.getText().isEmpty()){
            textField.setText("0.");
        } else if (textField.getText().contains(".")){
            textField.setText("");
            message.setText("There's already one dot!");
        } else {
            textField.appendText(".");
        }
    }

    public void equalsSign() {
        System.out.println("u clicked on equalsSign BUTTON.");
        number2 = Double.parseDouble(textField.getText());

        switch (option) {
            case 1:
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    message.setText("You cannot divide by 0!");
                    textField.setText("");
                }
                break;
            case 2:
                result = number1 * number2;
                break;
            case 3:
                result = number1 - number2;
                break;
            case 4:
                result = number1 + number2;
                break;
        }
        textField.setText(Double.toString(result));
    }

    public void C() {
        System.out.println("u clicked on C BUTTON.");
        textField.setText("");
        message.setText("");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}
