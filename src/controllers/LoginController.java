package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    Label LbError;

    @FXML
    TextField tfGroup;

    public void btnTryLogin(ActionEvent actionEvent) {
        if (tfGroup.getText().isEmpty()) {
            LbError.setText("Введите группу");
            LbError.setVisible(true);
        }
        else {
            LbError.setVisible(false);
        }
    }
}
