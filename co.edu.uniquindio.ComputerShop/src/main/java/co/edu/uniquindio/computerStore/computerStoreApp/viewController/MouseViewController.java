package co.edu.uniquindio.computerStore.computerStoreApp.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.computerStore.computerStoreApp.controller.MouseController;
import co.edu.uniquindio.computerStore.computerStoreApp.model.Mouse;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MouseViewController {
    MouseController mouseController;
    ObservableList<Mouse> mouseObservableList = FXCollections.observableArrayList();
    Mouse mouseSeleccionado;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Mouse, String> tcMarca;

    @FXML
    private Button buttonLimpiar;

    @FXML
    private TextField txtIDPoducto;

    @FXML
    private TableColumn<Mouse, String> tcCantidadBotones;

    @FXML
    private TableColumn<Mouse, String> tcCantidad;

    @FXML
    private TableColumn<Mouse, String> tcIDProduct;

    @FXML
    private Button buttonEliminar;

    @FXML
    private TextField txtSensor;

    @FXML
    private Button buttonActualizar;

    @FXML
    private TableView<Mouse> tcTableView;

    @FXML
    private TextField txtCantidadBotones;

    @FXML
    private Button buttonAgregar;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtMarca;

    @FXML
    private TableColumn<Mouse, String> tcSensor;

    @FXML
    void inicialize(){
         mouseController = new MouseController();
         initView();
    }

    private void initView() {
        initDataBinding();
        obtenerMouses();
        tcTableView.getItems().clear();
        tcTableView.setItems(mouseObservableList);
        listenerSelection();
    }

    private void listenerSelection() {
        tcTableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            mouseSeleccionado = newSelection;
            mostrarInformacionMouses(mouseSeleccionado);
        });
    }

    private void mostrarInformacionMouses(Mouse mouseSeleccionado) {
        if (mouseSeleccionado != null){
            txtIDPoducto.setText(mouseSeleccionado.getIdProduct());
            txtMarca.setText(mouseSeleccionado.getMarca());
            txtCantidad.setText(String.valueOf(mouseSeleccionado.getQuantity()));
            txtSensor.setText(mouseSeleccionado.getSensor());
            txtCantidadBotones.setText(String.valueOf(     mouseSeleccionado.getNumberButtons()));
        }
    }

    private void obtenerMouses() {
        mouseObservableList.addAll(mouseController.obtenerMouses());
    }

    private void initDataBinding() {
        tcIDProduct.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdProduct()));
        tcCantidad.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(   cellData.getValue().getQuantity())));
        tcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tcSensor.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getSensor())));
        tcCantidadBotones.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(  cellData.getValue().getNumberButtons())));
    }
}
