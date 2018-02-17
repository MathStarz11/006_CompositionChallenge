package com.christodd;

public class Oven {
    private String manufacturer;
    private String model;
    private Dimensions dimensions;
    private int burners;
    private Temperature temp;

    public Oven(String manufacturer, String model, Dimensions dimensions, int burners, Temperature temp) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dimensions = dimensions;
        this.burners = burners;
        this.temp = temp;
    }

    public void makePizza() {
        temp.setSetting("high");
        temp.heat("oven");
        System.out.println("You are making a pizza!");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getBurners() {
        return burners;
    }

    public Temperature getTemp() {
        return temp;
    }
}
