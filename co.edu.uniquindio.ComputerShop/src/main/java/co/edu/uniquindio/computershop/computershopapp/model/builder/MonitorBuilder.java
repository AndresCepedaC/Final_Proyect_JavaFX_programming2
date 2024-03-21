package co.edu.uniquindio.computershop.computershopapp.model.builder;

import co.edu.uniquindio.computershop.computershopapp.model.Monitor;

public class MonitorBuilder extends ProductBuilder<MonitorBuilder>{
    private String sizeScreen;
    private String refresh;

    public MonitorBuilder setSizeScreen(String sizeScreen) {
        this.sizeScreen = sizeScreen;return this;
    }

    public MonitorBuilder setRefresh(String refresh) {
        this.refresh = refresh;return this;
    }
    @Override
    public Monitor build(){
        return new Monitor(idProduct,quantity,marca,sizeScreen,refresh);
    }
}
