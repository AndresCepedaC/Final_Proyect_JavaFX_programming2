package co.edu.uniquindio.computershop.computershopapp.model;

public class Mouse extends Product{
    private String sensor;
    private int numberButtons;

    public Mouse() {
    }

    public Mouse(String idProduct, int quantity, String marca, String sensor, int numberButtons) {
        super(idProduct, quantity, marca);
        this.sensor = sensor;
        this.numberButtons = numberButtons;
    }

    public String getSensor() {
        return sensor;
    }

    public int getNumberButtons() {
        return numberButtons;
    }
}
