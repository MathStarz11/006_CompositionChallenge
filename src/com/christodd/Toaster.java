package com.christodd;

public class Toaster {
    private String manufacturer;
    private int slots;
    private Temperature temp;


    public Toaster(String manufacturer, int slots, Temperature temp) {
        this.manufacturer = manufacturer;
        this.slots = slots;
        this.temp = temp;

    }

    public void pushDownToasterLever(String setting) {
        temp.setSetting(setting);
        System.out.println("Toaster being used on " + temp.getSetting());
        temp.heat("toaster");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSlots() {
        return slots;
    }
}
