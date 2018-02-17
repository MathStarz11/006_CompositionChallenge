package com.christodd;

public class Table {
    private int chairs;
    private String woodType;
    private String centerpiece;
    private Dimensions dimensions;

    public Table(int chairs, String woodType, String centerpiece, Dimensions dimensions) {
        this.chairs = chairs;
        this.woodType = woodType;
        this.centerpiece = centerpiece;
        this.dimensions = dimensions;
    }

    public void sitDown() {
        System.out.println("Sitting at Table");
    }
    public int getChairs() {
        return chairs;
    }

    public String getWoodType() {
        return woodType;
    }

    public String getCenterpiece() {
        return centerpiece;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
