package com.ua.robot.lesson11.nfs;



public class Car {
    protected String brand;
    protected String model;
    protected int maxSpeed;
    protected int acceleration;
    protected int brakingForce;

    protected String imagePath;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getBrakingForce() {
        return brakingForce;
    }

    public void setBrakingForce(int brakingForce) {
        this.brakingForce = brakingForce;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Car(String brand, String model, int maxSpeed, int acceleration, int brakingForce, String image) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.brakingForce = brakingForce;
        this.imagePath = image;
    }
}
