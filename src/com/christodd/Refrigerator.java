package com.christodd;

public class Refrigerator {
    private String model;
    private String manufacturer;
    private int food;
    private Dimensions dimensions;

    public Refrigerator(String model, String manufacturer, int food, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.food = food;
        this.dimensions = dimensions;
    }

    public void getIceFromMaker () {
        System.out.println("Ice is coming out into cup");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getFood() {
        return food;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}


