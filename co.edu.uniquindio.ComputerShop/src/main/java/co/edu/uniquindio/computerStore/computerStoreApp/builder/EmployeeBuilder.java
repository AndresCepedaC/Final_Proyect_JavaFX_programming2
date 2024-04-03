package co.edu.uniquindio.computerStore.computerStoreApp.builder;

import co.edu.uniquindio.computerStore.computerStoreApp.model.Employee;

public class EmployeeBuilder {
    private String ID;
    private String name;
    private String email;
    private String cellPhone;
    private int age;
    private String zone;

    public EmployeeBuilder setID(String ID) {
        this.ID = ID;return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;return this;
    }

    public EmployeeBuilder setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;return this;
    }

    public EmployeeBuilder setZone(String zone) {
        this.zone = zone;return this;
    }
    public Employee build(){
        return new Employee(ID, name, email, cellPhone,age,zone);
    }
}
