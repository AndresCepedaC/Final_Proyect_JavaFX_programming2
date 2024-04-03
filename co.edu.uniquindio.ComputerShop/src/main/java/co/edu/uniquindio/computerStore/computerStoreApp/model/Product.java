package co.edu.uniquindio.computerStore.computerStoreApp.model;

public class Product {
    private String idProduct;
    private int quantity;
    private String marca;

    public Product() {
    }

    public Product(String idProduct, int quantity, String marca) {
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.marca = marca;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMarca() {
        return marca;
    }

}