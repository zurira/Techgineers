package com.ejemplo.libreria;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private PasswordField txtConfirmar;

    @FXML
    private Label lblMensaje;

    @FXML
    protected void registrar() {
        String usuario = txtUsuario.getText().trim();
        String pass1 = txtContrasena.getText();
        String pass2 = txtConfirmar.getText();

        if (usuario.isEmpty() || pass1.isEmpty() || pass2.isEmpty()) {
            lblMensaje.setText("❌ Completa todos los campos");
            lblMensaje.setStyle("-fx-text-fill: red;");
        } else if (!pass1.equals(pass2)) {
            lblMensaje.setText("❌ Las contraseñas no coinciden");
            lblMensaje.setStyle("-fx-text-fill: red;");
        } else {
            lblMensaje.setText("✅ Usuario registrado: " + usuario);
            lblMensaje.setStyle("-fx-text-fill: green;");
            txtUsuario.clear();
            txtContrasena.clear();
            txtConfirmar.clear();
        }
    }
}