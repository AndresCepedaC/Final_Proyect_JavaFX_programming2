package co.edu.uniquindio.computerStore.computerStoreApp.builder;

import co.edu.uniquindio.computerStore.computerStoreApp.model.KeyBoard;

public class KeyBoardBuilder extends ProductBuilder<KeyBoardBuilder>{
    private String swich;
    private String color;
    private String sizeKeyboard;

    public KeyBoardBuilder setSwich(String swich) {
        this.swich = swich;return this;
    }

    public KeyBoardBuilder setColor(String color) {
        this.color = color;return this;
    }

    public KeyBoardBuilder setSizeKeyboard(String sizeKeyboard) {
        this.sizeKeyboard = sizeKeyboard;return this;
    }
    @Override
    public KeyBoard build(){
        return new KeyBoard(idProduct,quantity,marca,swich,color,sizeKeyboard);
    }

}
