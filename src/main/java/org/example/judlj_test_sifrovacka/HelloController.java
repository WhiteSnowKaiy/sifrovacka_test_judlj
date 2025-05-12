package org.example.judlj_test_sifrovacka;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import org.example.judlj_test_sifrovacka.Ciphers.CaesarCipher;
import org.example.judlj_test_sifrovacka.Ciphers.NumberCipher;

public class HelloController {
    CaesarCipher cs = new CaesarCipher();
    NumberCipher ns = new NumberCipher();
    boolean cipherSwitch = false;
    @FXML
    private ToggleButton picker;
    @FXML
    private TextField cipher;
    @FXML
    private TextField decipher;
    @FXML
    private Button encrypt;

    @FXML
    protected void onPickerClick() {
        if (cipherSwitch) { cipherSwitch = false; }
        else { cipherSwitch = true; }
    }

    @FXML
    protected void onCipherButtonClick() {
        if (!cipherSwitch) {
            if (!cipher.getText().isEmpty()) {
                String t = cs.cipher(cipher.getText());
                decipher.setText(t);
            } else if (!decipher.getText().isEmpty()) {
                String t = cs.decipher(decipher.getText());
                cipher.setText(t);
            } else {
                System.out.println("Cipher or Decipher is empty");
            }
        } else {
            if (!cipher.getText().isEmpty()) {
                String t = ns.cipher(cipher.getText());
                decipher.setText(t);
            } else if (!decipher.getText().isEmpty()) {
                String t = ns.decipher(decipher.getText());
                cipher.setText(t);
            }
        }
    }
}