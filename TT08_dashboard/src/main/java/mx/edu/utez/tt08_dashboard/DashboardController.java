package mx.edu.utez.tt08_dashboard;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class DashboardController {


    @FXML
    private AnchorPane mainContent;

    @FXML
    public void initialize() {
        goToHome();  // Carga la vista de inicio al arrancar
    }

    public void goToHome() {
        loadView("/view/home.fxml");
    }

    public void goToSearch() {
        loadView("/view/search.fxml");
    }

    public void goToSaved(){
        loadView("/view/saved.fxml");
    }

    public void goToFavorites() {
        loadView("/view/favorites.fxml");
    }

    public void logout() {
        // Se podría cambiar a la vista de login
        System.exit(0);
    }

    private void loadView(String fxmlPath) {
        try {
            Parent view = FXMLLoader.load(getClass().getResource(fxmlPath));
            mainContent.getChildren().setAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}