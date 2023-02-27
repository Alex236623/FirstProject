package com.ua.robot.oop.lesson12;

public class Parent extends GrandParent {
    private int parentNumber;

    {
        System.out.println("4. Upper initialization block after all blocks from extends class(IB and Constructors)  /Parent Class");
    }

    public Parent(int number, int parentNumber) {
        super(number);
        this.parentNumber = parentNumber;
        System.out.println("6. Constructor after all initialization block/Parent Class");
    }

    {
        System.out.println("5. Next initialization block(even if it after constructor)/Parent Class");
    }
}
