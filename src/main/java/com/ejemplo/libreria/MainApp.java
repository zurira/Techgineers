package com.ejemplo.libreria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
       //Parent root = FXMLLoader.load(getClass().getResource("/Techgineers/src/main/resources/com/ejemplo/libreria/resgistro.fxml"));
       // Parent root = FXMLLoader.load(getClass().getResource("src/main/com/ejemplo/libreria/resgistro.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/com/ejemplo/libreria/resgistro.fxml"));
        primaryStage.setTitle("Registro de Usuario");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}