module mx.edu.utez.tt07_dashboard {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.tt07_dashboard to javafx.fxml;
    exports mx.edu.utez.tt07_dashboard;
}