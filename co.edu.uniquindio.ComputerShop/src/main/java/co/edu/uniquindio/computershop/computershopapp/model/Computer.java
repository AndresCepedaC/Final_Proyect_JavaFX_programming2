package co.edu.uniquindio.computershop.computershopapp.model;

import co.edu.uniquindio.computershop.computershopapp.model.builder.ComputerBuilder;

public class Computer  extends Product{
    private String processor;
    private String motherBoard;
    private String RAM;
    private String SSD;
    private String powerSource;
    private int fans;
    private String graphicCard;
    private String cabinet;


    public Computer() {
    }

    public Computer(String processor, String motherBoard, String RAM, String SSD, String powerSource, int fans, String graphicCard, String cabinet) {
        this.processor = processor;
        this.motherBoard = motherBoard;
        this.RAM = RAM;
        this.SSD = SSD;
        this.powerSource = powerSource;
        this.fans = fans;
        this.graphicCard = graphicCard;
        this.cabinet = cabinet;
    }

    public Computer(String idProduct, int quantity, String marca, String processor, String motherBoard, String RAM, String SSD, String powerSource, int fans, String graphicCard, String cabinet) {
        super(idProduct, quantity, marca);
        this.processor = processor;
        this.motherBoard = motherBoard;
        this.RAM = RAM;
        this.SSD = SSD;
        this.powerSource = powerSource;
        this.fans = fans;
        this.graphicCard = graphicCard;
        this.cabinet = cabinet;
    }

    public static ComputerBuilder builder(){
        return new ComputerBuilder();
    }
    public String getProcessor() {
        return processor;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getRAM() {
        return RAM;
    }

    public String getSSD() {
        return SSD;
    }

    public int getFans() {
        return fans;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getCabinet() {
        return cabinet;
    }
}
