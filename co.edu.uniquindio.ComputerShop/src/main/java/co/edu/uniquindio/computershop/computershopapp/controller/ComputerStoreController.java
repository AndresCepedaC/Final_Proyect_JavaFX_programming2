package co.edu.uniquindio.computershop.computershopapp.controller;

import co.edu.uniquindio.computershop.computershopapp.modelfactory.ModelFactory;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class ComputerStoreController {
    ModelFactory modelFactory;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstancia();
    }
}
