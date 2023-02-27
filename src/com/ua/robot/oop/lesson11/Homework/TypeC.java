package com.ua.robot.oop.lesson11.Homework;

public class TypeC extends Car {

    double carCargo;

    public double getCarCargo() {
        return carCargo;
    }

    public void setCarCargo(double carCargo) {
        this.carCargo = carCargo;
        setCarType();
    }

    public String getBrand() {
        return super.brand;
    }

    /*перевизначений метод ↓*/
    protected void setCarType() {
        if (carCargo > 0 && carCargo <= 2) {
            setCarType("C1");
        } else if (carCargo > 2 && carCargo <= 5) {
            setCarType("C2");
        } else {
            setCarType("Not defined Type C car");
        }

    }

    public TypeC(double carCargo) {
        this.carCargo = carCargo;
    }

    public TypeC(String brand, String model, int productionYear, double carCargo) {
        super(brand, model, productionYear);
        setCarCargo(carCargo);
    }

    @Override
    public String toString() {
        return "TypeC{" +
                "carCargo=" + carCargo +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carType='" + carType + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
