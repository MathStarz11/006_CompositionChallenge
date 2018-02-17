package com.christodd;

public class Temperature {
    private int temperature;
    private String setting;

    public Temperature() {
        this.temperature = 0;
        this.setting = "off";
    }

    public void heat(String object){
        if (setting == "off") {
            this.temperature = 0;
        } else if(setting == "low") {
            this.temperature = 250;
        } else if (setting == "medium") {
            this.temperature = 300;
        } else if (setting == "high") {
            this.temperature = 350;
        }
        tempMessage(object);
    }

    public void tempMessage(String object) {
        System.out.println("Current temp of " + object + " is: " + temperature);
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getSetting() {
        return setting;
    }

}
