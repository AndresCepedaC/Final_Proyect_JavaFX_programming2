package co.edu.uniquindio.computerStore.computerStoreApp.builder;

import co.edu.uniquindio.computerStore.computerStoreApp.model.Product;

public class ProductBuilder <T extends ProductBuilder<T>>{
    protected String idProduct;
    protected int quantity;
    protected String marca;
    public T setIdProduct(String idProduct) {
        this.idProduct = idProduct;
        return self();
    }

    public T setQuantity(int quantity) {
        this.quantity = quantity;
        return self();
    }

    public T setMarca(String marca) {
        this.marca = marca; return self();
    }

    @SuppressWarnings("unchecked")
    protected T self(){
        return (T) this;
    }
    public Product build (){
        return new Product(idProduct, quantity, marca);
    }
}
