package co.edu.uniquindio.computerStore.computerStoreApp.builder;

import co.edu.uniquindio.computerStore.computerStoreApp.model.Computer;

public class ComputerBuilder extends ProductBuilder<ComputerBuilder>{
    private String processor;
    private String motherBoard;
    private String RAM;
    private String SSD;
    private int fans;
    private String powerSource;
    private String graphicCard;
    private String cabinet;

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;return this;
    }

    public ComputerBuilder setSSD(String SSD) {
        this.SSD = SSD;return this;
    }
    public ComputerBuilder setPowerSource(String powerSource){
        this.powerSource = powerSource;
        return this;
    }

    public ComputerBuilder setFans(int fans) {
        this.fans = fans;return this;
    }

    public ComputerBuilder setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;return this;
    }

    public ComputerBuilder setCabinet(String cabinet) {
        this.cabinet = cabinet;return this;
    }
    @Override
    public Computer build(){
        return new Computer(idProduct, quantity, marca, processor, motherBoard,RAM, SSD,powerSource, fans, graphicCard,cabinet);
    }
}
