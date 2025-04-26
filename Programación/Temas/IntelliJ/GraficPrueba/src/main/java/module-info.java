module com.example.graficprueba {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.graficprueba to javafx.fxml;
    exports com.example.graficprueba;
    exports com.example.graficprueba.controlador;
    opens com.example.graficprueba.controlador to javafx.fxml;
}