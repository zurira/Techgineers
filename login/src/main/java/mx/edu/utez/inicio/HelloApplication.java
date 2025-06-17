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
        VBox loginCard = new VBox(15);
        loginCard.setPadding(new Insets(30));
        loginCard.setAlignment(Pos.CENTER);
        loginCard.setMaxWidth(300);
        loginCard.setStyle("-fx-background-color: rgba(255,255,255,0.9); -fx-background-radius: 20;");

        //Logo de forma circular
        Circle logo = new Circle(40);
        logo.setFill(Color.LIGHTPINK);
        Label lblLogo = new Label("LOGO");
        lblLogo.setTextFill(Color.GRAY);
        StackPane logoContainer = new StackPane(logo, lblLogo);

        //Titulo
        Label title = new Label("INICIO DE SESIÓN");
        title.setFont(Font.font("Arial", 16));
        title.setTextFill(Color.GRAY);

        //Etquetas y campo de textoo
        Label lblUser = new Label("USUARIO");
        TextField txtUser = new TextField();
        txtUser.setPromptText("Ingresa tu usuario");
        txtUser.setStyle("-fx-background-color: #A38F85; -fx-text-fill: white;");

        Label lblPassword = new Label("CONTRASEÑA");
        PasswordField txtPassword = new PasswordField();
        txtPassword.setPromptText("Ingresa tu contraseña");
        txtPassword.setStyle("-fx-background-color: #A38F85; -fx-text-fill: white;");

        // Botón para iniciar sesión
        Button loginButton = new Button("Iniciar sesión");
        loginButton.setStyle("-fx-background-color: #D09C8B; -fx-text-fill: white; -fx-font-weight: bold;");

        // Simulación de link de registro
        Hyperlink registerLink = new Hyperlink("Registrarme");
        registerLink.setTextFill(Color.GRAY);

        // Agregar elementos al panel
        loginCard.getChildren().addAll(
                logoContainer, title,
                lblUser, txtUser, lblPassword,
                txtPassword, loginButton, registerLink
        );

        root.getChildren().add(loginCard);

        Scene scene = new Scene(root, 700, 450);
        stage.setTitle("Inicio de sesión biblioteca");
        stage.setScene(scene);
        stage.show();

        //Interfaz terminada, aun no es funcional
    }

    public static void main(String[] args) {
        launch();
    }
}