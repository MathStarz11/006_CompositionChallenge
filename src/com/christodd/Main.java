package com.christodd;

public class Main {

    public static void main(String[] args) {
        Dimensions fridgeDim = new Dimensions(7,4,3);
        Dimensions tableDim = new Dimensions(3,4,4);

        Temperature toasterTemp = new Temperature();
        Temperature ovenTemp = new Temperature();

	    Refrigerator fridge = new Refrigerator("Ultra Cold","GE", 100, fridgeDim);
	    Table table = new Table(5,"Maple","Apples", tableDim);
	    Toaster toaster = new Toaster("GE",4, toasterTemp);
	    Oven oven = new Oven("GE","Super Heat", new Dimensions(3,3,3), 6, ovenTemp);

	    Kitchen kitchen = new Kitchen(fridge, table, toaster, oven);
	    kitchen.useKitchen();
	    kitchen.getFridge().getFood();


    }
}
