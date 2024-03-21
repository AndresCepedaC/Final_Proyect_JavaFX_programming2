package co.edu.uniquindio.computershop.computershopapp.model;

import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private List<Computer> computerList = new ArrayList<>();
    private List<Mouse> mouseList = new ArrayList<>();
    private List<Monitor> monitorList = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    private List<KeyBoard> keyBoardList = new ArrayList<>();

    public ComputerStore() {
    }

    public List<Mouse> obtenerListaMouses() {
        return mouseList;
    }

    public List<Computer> getComputerList() {
        return computerList;
    }

    public void setComputerList(List<Computer> computerList) {
        this.computerList = computerList;
    }

    public List<Mouse> getMouseList() {
        return mouseList;
    }

    public void setMouseList(List<Mouse> mouseList) {
        this.mouseList = mouseList;
    }

    public List<Monitor> getMonitorList() {
        return monitorList;
    }

    public void setMonitorList(List<Monitor> monitorList) {
        this.monitorList = monitorList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<KeyBoard> getKeyBoardList() {
        return keyBoardList;
    }

    public void setKeyBoardList(List<KeyBoard> keyBoardList) {
        this.keyBoardList = keyBoardList;
    }
}
