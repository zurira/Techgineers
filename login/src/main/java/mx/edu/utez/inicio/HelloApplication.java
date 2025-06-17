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
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage)  {
        //Imagen de fondo
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

        //Contenedor del login
        VBox loginCard = new VBox();
        loginCard.setPadding(new Insets(30));
        loginCard.setAlignment(Pos.CENTER);
        loginCard.setMaxWidth(300);
        loginCard.setStyle("-fx-background-color: rgba(255,255,255,0.9); -fx-background-radius: 20;");

        //Logo de forma circular
        Circle logo = new Circle();
        logo.setFill(Color.LIGHTPINK);
        Label lblLogo = new Label();
        lblLogo.setTextFill(Color.GRAY);
        StackPane logoContainer = new StackPane(logo, lblLogo);

        //Titulo
        Label title = new Label("INICIO DE SESIÓN");
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        title.setTextFill(Color.GRAY);

        // Agregar elementos al panel
        loginCard.getChildren().addAll(
                logoContainer, title
        );

        root.getChildren().add(loginCard);

        Scene scene = new Scene(root, 700, 450);
        stage.setTitle("Inicio de sesión biblioteca");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}