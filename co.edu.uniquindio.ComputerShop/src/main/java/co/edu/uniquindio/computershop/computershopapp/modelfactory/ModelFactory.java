package co.edu.uniquindio.computershop.computershopapp.modelfactory;

import co.edu.uniquindio.computershop.computershopapp.model.ComputerShop;

public class ModelFactory {
    ModelFactory modelFactory;
    private ModelFactory (){
        ComputerShop computerShop = new ComputerShop();
        inicializarDatosPrueba();
    }
    public void getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
    }
    private void inicializarDatosPrueba() {
    }
}
