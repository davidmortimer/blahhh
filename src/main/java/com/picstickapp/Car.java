package com.picstickapp;

/**
 * Created by David on 11/05/2015.
 */
public class Car {
    private String VIN;
    private String color;
    private Integer miles;

    public Car() {

    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }
}
