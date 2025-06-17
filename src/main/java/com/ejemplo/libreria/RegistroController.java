package com.ejemplo.libreria;

import javafx.fxml.FXML;
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
    protected void registrar() {
        String usuario = txtUsuario.getText();
        String pass1 = txtContrasena.getText();
        String pass2 = txtConfirmar.getText();

        if (!pass1.equals(pass2)) {
            System.out.println("❌ Las contraseñas no coinciden");
        } else {
            System.out.println("✅ Usuario registrado: " + usuario);
        }
    }
}