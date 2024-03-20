module co.edu.uniquindio.computershop.computershopapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.computershop.computershopapp to javafx.fxml;
    exports co.edu.uniquindio.computershop.computershopapp;
}