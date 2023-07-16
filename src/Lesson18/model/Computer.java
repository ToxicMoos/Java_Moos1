package Lesson18.model;

import java.util.Objects;

public class Computer {
    //поля класса
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;

    //конструктор


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;

        //гетер и сетер

    }
//метод для сравнения обьектов
    @Override
    public boolean equals(Object obj) {  //сигнатура(отпечаток) метода : модификатор,тип возващаемого методом значения,имя метода
        //тип переменной и ее имя,которое принимает метод
        if (this == obj) return true;  //если мы сравниваем обьект сам с собой,возращаем true
        if (obj == null || getClass() != obj.getClass()) return false; //если мы сравниваем обьект c null ,или обьекты из разных классов
        Computer computer = (Computer) obj;//произdодим downcasting предложеного для сравнения обьекта до класса Computer
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand);
    }

    @Override
    public String toString() {
        return "Brand"+brand+",Processor"+cpu+"Memory"+ ram +"Hard Disc"+ssd;



    }
}
