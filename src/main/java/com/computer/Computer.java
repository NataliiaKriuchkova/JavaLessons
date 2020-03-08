package com.computer;

public class Computer {
    private int serialNumber;//0
    private float price;//0.0
    private int quantityCPU;//0
    private int frequencyCPU;
    private String manufacturer;//null

    // access_modificator void(or return type) name_of_method(incoming params or absent);
    public Computer(int newNumber,
                    float newPrice,
                    int newQuantity,
                    int newFrequency,
                    String newManufacturer) {
        serialNumber = newNumber;
        price = newPrice;
        quantityCPU = newQuantity;
        frequencyCPU = newFrequency;
        manufacturer = newManufacturer;
    }

    public void setPrice(float newPrice) {
        price = newPrice;
    }

    public float getPrice() {
        return price;
    }

    public void view() {
        System.out.println("Serial number = " + serialNumber + "\t Price = " + price);
    }
}
