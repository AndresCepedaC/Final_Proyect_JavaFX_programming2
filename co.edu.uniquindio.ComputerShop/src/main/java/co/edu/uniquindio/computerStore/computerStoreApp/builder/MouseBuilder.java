package co.edu.uniquindio.computerStore.computerStoreApp.builder;

import co.edu.uniquindio.computerStore.computerStoreApp.model.Mouse;

public class MouseBuilder extends ProductBuilder<MouseBuilder>{
    private String sensor;
    private int numberButtons;

    public MouseBuilder setSensor(String sensor) {
        this.sensor = sensor;return this;
    }

    public MouseBuilder setNumberButtons(int numberButtons) {
        this.numberButtons = numberButtons;return this;
    }
    @Override
    public Mouse build(){
        return new Mouse(idProduct,quantity,marca,sensor,numberButtons);
    }
}
