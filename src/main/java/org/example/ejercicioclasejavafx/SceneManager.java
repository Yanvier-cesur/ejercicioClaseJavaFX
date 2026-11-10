package org.example.ejercicioclasejavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {

    private static Stage primaryStage;

    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    public static void cambiarEscena(String fxmlFile, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SceneManager.class.getResource(fxmlFile));
            Parent root = fxmlLoader.load();

            if (primaryStage.getScene() == null) {
                primaryStage.setScene(new Scene(root));
            } else {
                primaryStage.getScene().setRoot(root);
            }

            primaryStage.setTitle(title);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}