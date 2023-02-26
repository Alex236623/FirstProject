package com.ua.robot.oop.lesson11.Homework;

public class TypeB extends Car {

    int engineCapacity;
    {
        System.out.println("1");
        {
            System.out.println("2");
        }
    }
    {
        System.out.println("3");
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        setCarType();
    }

    public String getBrand() {
        return super.brand;
    }

    /*перевизначений метод ↓*/
    protected void setCarType() {
        if (engineCapacity > 0 && engineCapacity < 1500) {
            setCarType("B1");
        } else if (engineCapacity >= 1500 && engineCapacity < 2500) {
            setCarType("B2");
        } else if (engineCapacity >= 2500) {
            setCarType("B3");

        } else {
            setCarType("Not defined Type B car");
        }

    }

    public TypeB() {

    }

    public TypeB(String brand, String model, int productionYear, int engineCapacity) {
        super(brand, model, productionYear);
        setEngineCapacity(engineCapacity);
    }

    @Override
    public String toString() {
        return "TypeB{" +
                "engineCapacity=" + engineCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carType='" + carType + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}