module mx.edu.utez.inicio {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens mx.edu.utez.inicio to javafx.fxml;
    exports mx.edu.utez.inicio;
}