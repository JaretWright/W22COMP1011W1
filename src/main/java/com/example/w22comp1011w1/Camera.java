package com.example.w22comp1011w1;

import java.util.Arrays;
import java.util.List;

public class Camera {
    private int resolution;
    private String make, model;
    private boolean slr;
    private double price;

    public Camera(String make, String model, int res, boolean slr, double price) {
        setResolution(res);
        setMake(make);
        setModel(model);
        setSlr(slr);
        setPrice(price);
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        List<String> validMakes = Arrays.asList("Canon","Nikon","Sony","Fujifilm");
        if (validMakes.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("Make must be in the list of: "+validMakes);
    }

    public String getModel() {
        return model;
    }

    /**
     * Valid models are Canon, Nikon or Sony
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSlr() {
        return slr;
    }

    public void setSlr(boolean slr) {
        this.slr = slr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 10 && price <= 5000)
            this.price = price;
        else
            throw new IllegalArgumentException("price must be in the range 10-5000");
    }
}
