package org.example.ejercicioclasejavafx.Controllers;

import javafx.fxml.FXML;
import org.example.ejercicioclasejavafx.SceneManager;

public class LoginController {

    @FXML
    private void login() {
        SceneManager.cambiarEscena("main-view.fxml", "Listado de registros - Main");
    }
}