package co.edu.uniquindio.computerStore.computerStoreApp.model;

import co.edu.uniquindio.computerStore.computerStoreApp.builder.CustomerBuilder;

public class Customer {
    private String ID;
    private String name;
    private String email;
    private String cellPhone;
    private int age;

    public Customer() {
    }

    public Customer(String ID, String name, String email, String cellPhone, int age) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.cellPhone = cellPhone;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public int getAge() {
        return age;
    }
    public CustomerBuilder builder(){
        return new CustomerBuilder();
    }
}
