package co.edu.uniquindio.computershop.computershopapp.modelfactory;

import co.edu.uniquindio.computershop.computershopapp.model.ComputerStore;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private ComputerStore computerStore;
    private ModelFactory (){
        computerStore = new ComputerStore();
        inicializarDatosPrueba();
    }
    public static ModelFactory getInstancia(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    private void inicializarDatosPrueba() {
    }
}
