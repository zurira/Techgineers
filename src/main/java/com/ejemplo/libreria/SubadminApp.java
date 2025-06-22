package com.ejemplo.libreria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SubadminApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/ejemplo/libreria/Subadmin.fxml"));
        Scene scene = new Scene(root, 900, 600);

        // Aquí cargas la hoja de estilos
        scene.getStylesheets().add(getClass().getResource("/com/ejemplo/libreria/estilos.css").toExternalForm());

        primaryStage.setTitle("Subadministrador");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}