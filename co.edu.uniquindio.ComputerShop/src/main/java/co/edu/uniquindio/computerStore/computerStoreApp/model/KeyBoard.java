package co.edu.uniquindio.computerStore.computerStoreApp.model;

public class KeyBoard  extends Product{
    private String swich;
    private String color;
    private String sizeKeyboard;

    public KeyBoard() {
    }

    public KeyBoard(String idProduct, int quantity, String marca, String swich, String color, String sizeKeyboard) {
        super(idProduct, quantity, marca);
        this.swich = swich;
        this.color = color;
        this.sizeKeyboard = sizeKeyboard;
    }

    public String getSwich() {
        return swich;
    }

    public String getColor() {
        return color;
    }

    public String getSizeKeyboard() {
        return sizeKeyboard;
    }
}
