package com.example.reversetext;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField inputField;

    @FXML
    private Label outputLabel;

    @FXML
    protected void handleReverseAction() {
        String inputText = inputField.getText();
        if (inputText.length() <= 2999) {
            outputLabel.setText(reverseText(inputText));
        } else {
            outputLabel.setText("Текст превышает лимит в 2999 символов.");
        }
    }

    private String reverseText(String text) {
        // Логика переворачивания текста
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        int len = original.length;

        for (int i = 0; i < len; i++) {
            reversed[i] = original[len - i - 1];
        }

        return new String(reversed);
    }
}
