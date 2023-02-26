package com.ua.robot.oop.lesson12;

public class GrandParent {

    private int grandParentNumber;

    {
        System.out.println("1. Upper initialization block/GrandParent Class");
    }

    public GrandParent(int grandParentNumber) {
        this.grandParentNumber = grandParentNumber;
        System.out.println("3. Constructor after all initialization block /GrandParent Class");
    }

    {
        System.out.println("2. Next initialization block(even if it after constructor)/GrandParent Class");
    }
}
