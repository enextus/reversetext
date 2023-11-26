package com.example.reversetext;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HelloController {

    @FXML
    private TextArea inputField;

    @FXML
    private TextArea outputField;

    @FXML
    protected void handleReverseAction() {
        String inputText = inputField.getText();
        if (inputText.length() <= 2999) {
            outputField.setText(reverseText(inputText));
        } else {
            outputField.setText("Текст превышает лимит в 2999 символов.");
        }
    }

    private String reverseText(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        int len = original.length;

        for (int i = 0; i < len; i++) {
            reversed[i] = original[len - i - 1];
        }

        return new String(reversed);
    }

    @FXML
    protected void handleClearAction() {
        inputField.clear();
        outputField.clear();
    }
}
