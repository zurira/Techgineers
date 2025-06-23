package mx.edu.utez.tt07_dashboard;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class DashboardController {

    @FXML
    private BorderPane mainPane;

    @FXML
    private AnchorPane mainContent;

    // Botones de navegación
    @FXML private Button btnInicio;
    @FXML private Button btnBusqueda;
    @FXML private Button btnGuardados;
    @FXML private Button btnFavoritos;
    @FXML private Button btnCerrarSesion;

    @FXML
    public void initialize() {
        goToHome(); // carga Home al iniciar
    }

    private void loadView(String fxmlName) {
        try {
            URL url = getClass().getResource("/mx/edu/utez/tt07_dashboard/" + fxmlName);
            if (url == null) {
                System.err.println("No se encontró el archivo FXML: " + fxmlName);
                return;
            }

            Parent view = FXMLLoader.load(url);
            mainContent.getChildren().setAll(view);
            AnchorPane.setTopAnchor(view, 0.0);
            AnchorPane.setBottomAnchor(view, 0.0);
            AnchorPane.setLeftAnchor(view, 0.0);
            AnchorPane.setRightAnchor(view, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void resetButtonStyles() {
        List<Button> buttons = List.of(btnInicio, btnBusqueda, btnGuardados, btnFavoritos, btnCerrarSesion);
        for (Button btn : buttons) {
            btn.getStyleClass().remove("selected");
        }
    }

    @FXML
    private void goToHome() {
        loadView("/view/home.fxml");
        resetButtonStyles();
        btnInicio.getStyleClass().add("selected");
    }

    @FXML
    private void goToSearch() {
        loadView("/view/search.fxml");
        resetButtonStyles();
        btnBusqueda.getStyleClass().add("selected");
    }


    @FXML
    private void goToSaved() {
        loadView("/view/saved.fxml");
        resetButtonStyles();
        btnGuardados.getStyleClass().add("selected");
    }

    @FXML
    private void goToFavorites() {
        loadView("/view/favorites.fxml");
        resetButtonStyles();
        btnFavoritos.getStyleClass().add("selected");
    }

    @FXML
    private void goToLogout() {
        loadView("/view/logout.fxml");
        resetButtonStyles();
        btnCerrarSesion.getStyleClass().add("selected");
    }
}
