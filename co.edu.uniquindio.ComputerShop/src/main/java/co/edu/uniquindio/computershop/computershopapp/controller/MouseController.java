package co.edu.uniquindio.computershop.computershopapp.controller;

import co.edu.uniquindio.computershop.computershopapp.model.ComputerStore;
import co.edu.uniquindio.computershop.computershopapp.model.Mouse;
import co.edu.uniquindio.computershop.computershopapp.modelfactory.ModelFactory;

import java.util.List;

public class MouseController {
    ModelFactory modelFactory;
    public List<Mouse> obtenerMouses() {
        return  modelFactory.obtenerMouses();
    }
}
