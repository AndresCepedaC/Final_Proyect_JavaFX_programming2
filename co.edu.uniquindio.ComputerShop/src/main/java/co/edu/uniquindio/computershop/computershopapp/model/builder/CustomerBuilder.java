package co.edu.uniquindio.computershop.computershopapp.model.builder;

import co.edu.uniquindio.computershop.computershopapp.model.Customer;

public class CustomerBuilder{
    protected String ID;
    protected String name;
    protected String email;
    protected String cellPhone;
    protected int age;

    public CustomerBuilder setID(String ID) {
        this.ID = ID;return this;
    }

    public CustomerBuilder setName(String name) {
        this.name = name;return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;return this;
    }

    public CustomerBuilder setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;return this;
    }

    public CustomerBuilder setAge(int age) {
        this.age = age;return this;
    }
    public Customer build(){
        return new Customer(ID, name, email, cellPhone,age);
    }
}
