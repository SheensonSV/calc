package com.forfun.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ButtonController {
    @FXML
    public Button buttonComa;
    @FXML
    public Button button0;
    @FXML
    public Button button1;
    @FXML
    public Button button2;
    @FXML
    public Button button3;
    @FXML
    public Button button4;
    @FXML
    public Button button5;
    @FXML
    public Button button6;
    @FXML
    public Button button7;
    @FXML
    public Button button8;
    @FXML
    public Button button9;
    @FXML
    public Button buttonMinus;
    @FXML
    public Button buttonDivision;
    @FXML
    public Button buttonPlus;
    @FXML
    public Button buttonMultiply;
    @FXML
    public Button buttonEquals;
    @FXML
    public Button buttonMemoPlus;
    @FXML
    public Button buttonMemoMinus;
    @FXML
    public ProgressBar progressBar;
    @FXML
    public TextField textField;
    @FXML
    public Button buttonSignMinus;

    void press(Button someButton){
        if (someButton.getId().equals("0")){
            System.out.println("0");
        }
    }

    @FXML
    private void onButtonClicked0(MouseEvent mouseEvent) throws InterruptedException {
        NumberHolder.addNumber(button0.getText());
    }

    public void onButtonClickedSingMinus(MouseEvent mouseEvent) {
        System.out.println("button.getText() - " + buttonSignMinus.getText());
        System.out.println("button.getId() - " + buttonSignMinus.getId());
    }

    public void onButtonClickedComa(MouseEvent mouseEvent) {
    }

    public void onButtonClicked1(MouseEvent mouseEvent) {
    }

    public void onButtonClicked2(MouseEvent mouseEvent) {
    }

    public void onButtonClicked3(MouseEvent mouseEvent) {
    }

    public void onButtonClicked4(MouseEvent mouseEvent) {
    }

    public void onButtonClicked5(MouseEvent mouseEvent) {
    }

    public void onButtonClicked6(MouseEvent mouseEvent) {
    }

    public void onButtonClickedEquals(MouseEvent mouseEvent) {
    }

    public void onButtonClickedMinus(MouseEvent mouseEvent) {
    }

    public void onButtonClickedDivision(MouseEvent mouseEvent) {
    }

    public void onButtonClickedPlus(MouseEvent mouseEvent) {
    }

    public void onButtonClickedMultiply(MouseEvent mouseEvent) {
    }

    public void onButtonClicked7(MouseEvent mouseEvent) {
    }

    public void onButtonClicked8(MouseEvent mouseEvent) {
    }

    public void onButtonClicked9(MouseEvent mouseEvent) {
    }

    public void onButtonClickedMemoPlus(MouseEvent mouseEvent) {
    }

    public void onButtonClickedMemoMinus(MouseEvent mouseEvent) {
    }
}
