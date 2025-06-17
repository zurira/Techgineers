package mx.edu.utez.inicio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage)  {
        Image backgroundImage = new Image (getClass().getResourceAsStream("/images/fondo.jpg"));
        BackgroundImage background = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(200,100, true, true,true, false)
        );

        StackPane root = new StackPane();
        root.setBackground(new Background(background));

        Scene scene = new Scene(root, 700, 450);
        stage.setTitle("Inicio de sesión biblioteca");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}