package co.edu.uniquindio.computershop.computershopapp.model;

import co.edu.uniquindio.computershop.computershopapp.model.builder.EmployeeBuilder;

public class Employee {
    private String ID;
    private String name;
    private String email;
    private String cellPhone;
    private int age;
    private String zone;

    public Employee(String ID, String name, String email, String cellPhone, int age, String zone) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.cellPhone = cellPhone;
        this.age = age;
        this.zone = zone;
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

    public String getZone() {
        return zone;
    }
    public EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }
}
