package co.edu.uniquindio.computershop.computershopapp.model.builder;

import co.edu.uniquindio.computershop.computershopapp.model.Computer;

public class ComputerBuilder extends ProductBuilder<ComputerBuilder>{
    private String processor;
    private String motherBoard;
    private String RAM;
    private String SSD;
    private int fans;
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
        return new Computer(idProduct, quantity, marca, processor, motherBoard,RAM, SSD, fans, graphicCard,cabinet);
    }
}
