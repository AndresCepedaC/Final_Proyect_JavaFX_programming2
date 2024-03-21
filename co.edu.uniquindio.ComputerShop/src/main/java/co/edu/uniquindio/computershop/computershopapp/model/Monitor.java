package co.edu.uniquindio.computershop.computershopapp.model;

public class Monitor  extends Product{
    private String sizeScreen;
    private String refresh;

    public Monitor() {
    }

    public Monitor(String idProduct, int quantity, String marca, String sizeScreen, String refresh) {
        super(idProduct, quantity, marca);
        this.sizeScreen = sizeScreen;
        this.refresh = refresh;
    }

    public String getSizeScreen() {
        return sizeScreen;
    }

    public String getRefresh() {
        return refresh;
    }
}
