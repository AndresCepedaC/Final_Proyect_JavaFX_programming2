module co.edu.uniquindio.computershop.computershopapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.computerStore.computerStoreApp to javafx.fxml;
    exports co.edu.uniquindio.computerStore.computerStoreApp;

    opens co.edu.uniquindio.computerStore.computerStoreApp.controller;
    exports co.edu.uniquindio.computerStore.computerStoreApp.controller;

    opens co.edu.uniquindio.computerStore.computerStoreApp.viewController;
    exports co.edu.uniquindio.computerStore.computerStoreApp.viewController;
}