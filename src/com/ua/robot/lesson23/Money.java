package com.ua.robot.lesson23;

public class Money {
    int id;
    double sum;

    @Override
    public String toString() {
        return "Money{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }

    public Money(int id, double sum) {
        this.id = id;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
