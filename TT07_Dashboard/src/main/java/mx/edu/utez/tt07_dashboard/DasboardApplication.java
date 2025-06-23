package mx.edu.utez.tt07_dashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DasboardApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mx/edu/utez/tt07_dashboard/dashboard.fxml"));
        Scene scene = new Scene(root, 320, 240);
        scene.getStylesheets().addAll(
                getClass().getResource("/css/styles.css").toExternalForm()
        );
        stage.setTitle("Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}