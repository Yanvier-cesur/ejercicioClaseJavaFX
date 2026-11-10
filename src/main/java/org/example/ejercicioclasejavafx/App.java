package org.example.ejercicioclasejavafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        SceneManager.setPrimaryStage(stage);
        SceneManager.cambiarEscena("login-view.fxml", "Login - InventarioApp");
    }

    public static void main(String[] args) {
        launch();
    }
}