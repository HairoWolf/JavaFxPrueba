package org.example.Controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EjemploController {
    @FXML
    private Button botonEjemplo;

    @FXML
    public void metodoEjemplo(Event event){
        System.out.println("Hola mundo JavaFx");
    }
}
