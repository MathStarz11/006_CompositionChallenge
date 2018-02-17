package com.christodd;

import com.christodd.Dimensions;
import com.christodd.Refrigerator;

public class Kitchen {
private Refrigerator fridge;
private Table table;
private Toaster toaster;
private Oven oven;

    public Kitchen(Refrigerator fridge, Table table, Toaster toaster, Oven oven) {
        this.fridge = fridge;
        this.table = table;
        this.toaster = toaster;
        this.oven = oven;
    }

    public Refrigerator getFridge() {
        return this.fridge;
    }

    public Table getTable() {
        return this.table;
    }

    public void useKitchen () {
        toaster.pushDownToasterLever("low");
        fridge.getIceFromMaker();
        oven.makePizza();
        table.sitDown();
    }
}
