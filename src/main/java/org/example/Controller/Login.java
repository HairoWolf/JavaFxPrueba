package org.example.Controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;
import java.util.Locale;

public class Login {
    @FXML
    private Button botonInicio;
    @FXML
    private TextField UserName;
    @FXML
    private PasswordField UserPass;

    @FXML
    public void Inicio(Event event) throws IOException {
        String TextUser=UserName.getText();
        String TextPass = UserPass.getText();
        if(TextUser.toLowerCase().equals("admin")){
            if(TextPass.equals("soyAdmin")){
                System.out.print("Eres Admin");
                App.setRoot("primary");
            }
            else{
                System.out.print("A ondes vas vasilon?");
            }
        }
        else {
            System.out.println("Que pasa tontito?");
        }

    }
}
