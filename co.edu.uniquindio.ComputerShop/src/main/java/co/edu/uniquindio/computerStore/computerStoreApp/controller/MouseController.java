package co.edu.uniquindio.computerStore.computerStoreApp.controller;

import co.edu.uniquindio.computerStore.computerStoreApp.modelfactory.ModelFactory;
import co.edu.uniquindio.computerStore.computerStoreApp.model.Mouse;

import java.util.List;

public class MouseController {
    ModelFactory modelFactory;
    public List<Mouse> obtenerMouses() {
        return  modelFactory.obtenerMouses();
    }
}
