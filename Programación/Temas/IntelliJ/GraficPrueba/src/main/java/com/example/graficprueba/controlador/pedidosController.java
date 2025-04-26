package com.example.graficprueba.controlador;

import com.example.graficprueba.modelo.Cliente;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;


public class pedidosController
{
    @javafx.fxml.FXML
    private Pane paneCliente;
    @javafx.fxml.FXML
    private TextField tfDireccion;
    @javafx.fxml.FXML
    private TextField tfCLiente;
    @javafx.fxml.FXML
    private TextField tfTelefono;
    @javafx.fxml.FXML
    private Button btGuardar;
    @javafx.fxml.FXML
    private Pane panePizza;
    @javafx.fxml.FXML
    private ComboBox cbTipo;
    @javafx.fxml.FXML
    private ToggleGroup tgtamano;
    @javafx.fxml.FXML
    private CheckBox cbMortadela;
    @javafx.fxml.FXML
    private CheckBox cbPiña;
    @javafx.fxml.FXML
    private CheckBox cbAceitunas;
    @javafx.fxml.FXML
    private Button btDatosPizza;

    @javafx.fxml.FXML
    public void initialize() {
        panePizza.setDisable(true);
        cbTipo.getItems().addAll("Margarrita", "Cuatro Quesos", "Hawaiana","Carbonara");
        cbTipo.setPromptText("Introduce tipo de pizza");
    }

    @javafx.fxml.FXML
    public void guardarDatosClientes(ActionEvent actionEvent) {
        Cliente c = new Cliente(tfCLiente.getText(), tfDireccion.getText(), tfTelefono.getText());


        if (tfCLiente.getText().isEmpty()){
            Alert alert2 = new Alert(Alert.AlertType.ERROR);
            alert2.setTitle("Error");
            alert2.setContentText("El cliente debe introducir su nombre");
            alert2.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Mensaje de confirmacion");
            alert.setHeaderText("Los datos del cliente son:");
            alert.setContentText(c.toString());
            alert.showAndWait();
            panePizza.setDisable(false);
        }
    }

    @javafx.fxml.FXML
    public void guardardatos2(ActionEvent actionEvent) {
        Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
        alert3.setTitle("¿Los datos son correctos?");
        alert3.setHeaderText("Los datos de la piiza son");
    }
}