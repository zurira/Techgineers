package com.ejemplo.libreria;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SubadministradorController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtApellidoP;
    @FXML private TextField txtApellidoM;
    @FXML private TextField txtEmail;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtDireccion;

    @FXML
    protected void editarPerfil() {
        System.out.println("✅ Editando perfil del subadministrador");
        System.out.println("Nombre: " + txtNombre.getText());
        System.out.println("Apellido Paterno: " + txtApellidoP.getText());
        System.out.println("Apellido Materno: " + txtApellidoM.getText());
        System.out.println("Email: " + txtEmail.getText());
        System.out.println("Teléfono: " + txtTelefono.getText());
        System.out.println("Dirección: " + txtDireccion.getText());
    }
}