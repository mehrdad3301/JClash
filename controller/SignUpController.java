package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {
    @FXML
    private TextField UserField;

    @FXML
    private PasswordField PasswordField1;

    @FXML
    private PasswordField PasswordField2;

    @FXML
    private Hyperlink LoginLink;

    @FXML
    private Button SignUpButton;
    @FXML
    public void actionHandler(ActionEvent event) throws IOException {
        if(event.getSource() == SignUpButton){

        }
        else if(event.getSource() == LoginLink) {
            Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
            Stage stage = (Stage) LoginLink.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        }
    }
}
