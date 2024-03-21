package co.edu.uniquindio.computershop.computershopapp.modelfactory;

import co.edu.uniquindio.computershop.computershopapp.model.*;
import co.edu.uniquindio.computershop.computershopapp.model.builder.*;

import java.util.List;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private ComputerStore computerStore;
    private ModelFactory (){
        computerStore = new ComputerStore();
        inicializarDatosPrueba();
    }
    public static ModelFactory getInstancia(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    private void inicializarDatosPrueba() {

//        Computers
        Computer computer = Computer
                .builder()
                .setCabinet("Segotep")
                .setFans(2)
                .setGraphicCard("4090")
                .setMotherBoard("Asus rog b550m")
                .setProcessor("i9 14900k")
                .setRAM("32")
                .setSSD("500")
                .setIdProduct("ABC")
                .setMarca("Intel, Nvidia")
                .setQuantity(10)
                .build();

        Computer computer2 = Computer
                .builder()
                .setCabinet("Segotep")
                .setFans(6)
                .setGraphicCard("4080")
                .setMotherBoard("Asus rog b550m")
                .setProcessor("i7 14700k")
                .setRAM("64")
                .setSSD("2TB")
                .setIdProduct("BCC")
                .setMarca("Intel, Nvidia")
                .setQuantity(4)
                .build();

        Computer computer3 = Computer
                .builder()
                .setCabinet("Iceverg")
                .setFans(10)
                .setGraphicCard("3070")
                .setMotherBoard("Gigabyte b550m")
                .setProcessor("Ryzen 7 5700x")
                .setRAM("16")
                .setSSD("1TB")
                .setIdProduct("CCB")
                .setMarca("AMD, Nvidia")
                .setQuantity(15)
                .build();

        Computer computer4 = Computer
                .builder()
                .setCabinet("Segotep")
                .setFans(4)
                .setGraphicCard("RX 6700XT")
                .setMotherBoard("Gaming X V2 b550m")
                .setProcessor("AMD ryzen 7 5800X 3D")
                .setRAM("32")
                .setSSD("4TB")
                .setIdProduct("RRT")
                .setMarca("AMD")
                .setQuantity(7)
                .build();

//        Employees
        Employee employee = new EmployeeBuilder()
                .setName("Andres")
                .setAge(18)
                .setCellPhone("300505")
                .setEmail("@Andres")
                .setID("12345")
                .setZone("Mouses")
                .build();

        Employee employee2 = new EmployeeBuilder()
                .setName("Felipe")
                .setAge(20)
                .setCellPhone("30005")
                .setEmail("@Felipe")
                .setID("4321")
                .setZone("Computers")
                .build();

        Employee employee3 = new EmployeeBuilder()
                .setName("Cepeda")
                .setAge(19)
                .setCellPhone("5005")
                .setEmail("@Cepeda")
                .setID("55533")
                .setZone("KeyBoards")
                .build();

        Employee employee4 = new EmployeeBuilder()
                .setName("Castrillon")
                .setAge(25)
                .setCellPhone("400050")
                .setEmail("@Castrillon")
                .setID("22333")
                .setZone("Monitors")
                .build();

//        Customers
        Customer customer = new CustomerBuilder()
                .setName("Roger")
                .setAge(50)
                .setCellPhone("30033")
                .setEmail("@Roger")
                .setID("33022")
                .build();
        Customer customer2 = new CustomerBuilder()
                .setName("Michael")
                .setAge(46)
                .setCellPhone("23444")
                .setEmail("@Michael")
                .setID("442244")
                .build();
        Customer customer3 = new CustomerBuilder()
                .setName("Lilian")
                .setAge(34)
                .setCellPhone("54455")
                .setEmail("@Lilian")
                .setID("44444")
                .build();
        Customer customer4 = new CustomerBuilder()
                .setName("Gladys")
                .setAge(65)
                .setCellPhone("10000")
                .setEmail("@Gladys")
                .setID("5555")
                .build();

//        Monitors
        Monitor monitor = new MonitorBuilder()
                .setIdProduct("1000")
                .setQuantity(10)
                .setMarca("Asus")
                .setRefresh("144 Hz")
                .setSizeScreen("47 pulgadas")
                .build();
        Monitor monitor2 = new MonitorBuilder()
                .setIdProduct("2090")
                .setQuantity(4)
                .setMarca("Gigabyte")
                .setRefresh("120 Hz")
                .setSizeScreen("24 pulgadas")
                .build();
        Monitor monitor3 = new MonitorBuilder()
                .setIdProduct("12444")
                .setQuantity(3)
                .setMarca("Fire")
                .setRefresh("240 Hz")
                .setSizeScreen("27 pulgadas")
                .build();
        Monitor monitor4 = new MonitorBuilder()
                .setIdProduct("9999")
                .setQuantity(5)
                .setMarca("LG")
                .setRefresh("75 Hz")
                .setSizeScreen("23.5 pulgadas")
                .build();

//        Mouses
        Mouse mouse = new MouseBuilder()
                .setIdProduct("20000")
                .setQuantity(5)
                .setMarca("RedDragon")
                .setSensor("Asus Rog ultimate generation")
                .setNumberButtons(7)
                .build();
        Mouse mouse2 = new MouseBuilder()
                .setIdProduct("12333")
                .setQuantity(5)
                .setMarca("Logitech")
                .setSensor("Red ultimate generation")
                .setNumberButtons(2)
                .build();
        Mouse mouse3 = new MouseBuilder()
                .setIdProduct("44433")
                .setQuantity(4)
                .setMarca("RedDragon")
                .setSensor("Asus Rog ultimate generation")
                .setNumberButtons(10)
                .build();
        Mouse mouse4 = new MouseBuilder()
                .setIdProduct("66666")
                .setQuantity(6)
                .setMarca("RedDragon")
                .setSensor("RED DRAGON")
                .setNumberButtons(9)
                .build();

//        KeyBoards
        KeyBoard keyBoard = new KeyBoardBuilder()
                .setIdProduct("4333")
                .setQuantity(6)
                .setMarca("Magee")
                .setSizeKeyboard("70%")
                .setColor("Rojo/Negro")
                .setSwich("Yellow")
                .build();
        KeyBoard keyBoard2 = new KeyBoardBuilder()
                .setIdProduct("12333")
                .setQuantity(10)
                .setMarca("Red Dragon")
                .setSizeKeyboard("100%")
                .setColor("Blanco/Naranja")
                .setSwich("Blue")
                .build();
        KeyBoard keyBoard3 = new KeyBoardBuilder()
                .setIdProduct("45555")
                .setQuantity(12)
                .setMarca("Logitech")
                .setSizeKeyboard("90%")
                .setColor("Amarillo/ROjo")
                .setSwich("Red")
                .build();
        KeyBoard keyBoard4 = new KeyBoardBuilder()
                .setIdProduct("1999")
                .setQuantity(6)
                .setMarca("Magee")
                .setSizeKeyboard("67%")
                .setColor("Blanco/Negro")
                .setSwich("Brown")
                .build();

        computerStore.getComputerList().add(computer);
        computerStore.getComputerList().add(computer2);
        computerStore.getComputerList().add(computer3);
        computerStore.getComputerList().add(computer4);

        computerStore.getCustomerList().add(customer);
        computerStore.getCustomerList().add(customer2);
        computerStore.getCustomerList().add(customer3);
        computerStore.getCustomerList().add(customer4);

        computerStore.getEmployeeList().add(employee);
        computerStore.getEmployeeList().add(employee2);
        computerStore.getEmployeeList().add(employee3);
        computerStore.getEmployeeList().add(employee4);

        computerStore.getMonitorList().add(monitor);
        computerStore.getMonitorList().add(monitor3);
        computerStore.getMonitorList().add(monitor2);
        computerStore.getMonitorList().add(monitor4);

        computerStore.getMouseList().add(mouse);
        computerStore.getMouseList().add(mouse2);
        computerStore.getMouseList().add(mouse3);
        computerStore.getMouseList().add(mouse4);

        computerStore.getKeyBoardList().add(keyBoard);
        computerStore.getKeyBoardList().add(keyBoard2);
        computerStore.getKeyBoardList().add(keyBoard3);
        computerStore.getKeyBoardList().add(keyBoard4);
    }

    public List<Mouse> obtenerMouses() {
        return computerStore.getMouseList();
    }
}
