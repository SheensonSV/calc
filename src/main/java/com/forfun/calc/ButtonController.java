package com.forfun.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ButtonController {

    @FXML
    private Button buttonComa;
    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonDivision;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonEquals;
    @FXML
    private Button buttonMemoPlus;
    @FXML
    private Button buttonMemoMinus;
    @FXML
    private ProgressBar progressBar;

    @FXML
    private TextField textField;
    @FXML
    private Button buttonSignMinus;

    @FXML
    public Button buttonBackSpace;
    @FXML
    public Button buttonClear;

    private void getZeroInTextField(){
        if (getTextField().getText().equals("")){
            changeText("0");
        }
    }

    @FXML
    public void onButtonClickedClear(MouseEvent mouseEvent) {
        changeText(NumberHolder.clear());
//        getZeroInTextField();
    }

    @FXML
    public void onButtonClickedBackSpace(MouseEvent mouseEvent) {
        changeText(NumberHolder.backSpace());
//        getZeroInTextField();
    }

    @FXML
    public void onButtonClickedSingMinus() {
        changeText(NumberHolder.makeNegativeOrPositiveNumber());
//        getZeroInTextField();
    }

    @FXML
    private void onButtonClicked0(MouseEvent mouseEvent){
        changeText(NumberHolder.addNumber(button0.getText()).toString());
//        getZeroInTextField();
    }

    @FXML
    public void onButtonClickedComa(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(buttonComa.getText()).toString());
    }

    @FXML
    public void onButtonClicked1(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button1.getText()).toString());

    }

    @FXML
    public void onButtonClicked2(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button2.getText()).toString());
    }

    @FXML
    public void onButtonClicked3(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button3.getText()).toString());
    }

    @FXML
    public void onButtonClicked4(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button4.getText()).toString());
    }

    @FXML
    public void onButtonClicked5(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button5.getText()).toString());
    }

    @FXML
    public void onButtonClicked6(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button6.getText()).toString());
    }

    @FXML
    public void onButtonClicked7(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button7.getText()).toString());
    }

    @FXML
    public void onButtonClicked8(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button8.getText()).toString());
    }

    @FXML
    public void onButtonClicked9(MouseEvent mouseEvent) {
        changeText(NumberHolder.addNumber(button9.getText()).toString());
    }

    @FXML
    public void onButtonClickedEquals(MouseEvent mouseEvent) {
        changeText(Result.getResult());
    }

    @FXML
    public void onButtonClickedMinus(MouseEvent mouseEvent) {
        changeText(Result.act(ActionsWithNumbers.MINUS));
    }

    @FXML
    public void onButtonClickedPlus(MouseEvent mouseEvent) {
        changeText(Result.act(ActionsWithNumbers.PLUS));
    }

    @FXML
    public void onButtonClickedMultiply(MouseEvent mouseEvent) {
        changeText(Result.act(ActionsWithNumbers.MULTIPLICATION));
    }

    @FXML
    public void onButtonClickedDivision(MouseEvent mouseEvent) {
        changeText(Result.act(ActionsWithNumbers.DIVISION));
    }

    @FXML
    public void onButtonClickedMemoPlus(MouseEvent mouseEvent) {
        Memo.memoPlus();
    }

    @FXML
    public void onButtonClickedMemoMinus(MouseEvent mouseEvent) {
        Memo.memoPlus();
    }

    public void changeText(String text){
        textField.setText(text);
    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

}
