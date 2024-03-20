package co.edu.uniquindio.computershop.computershopapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ComputerStoreApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ComputerStoreApplication.class.getResource("ComputerShop.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Computer Store app");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}