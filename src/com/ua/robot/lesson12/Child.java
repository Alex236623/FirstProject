package com.ua.robot.lesson12;

public class Child extends Parent{

    private final int childNumber;

    {
        System.out.println("7. Upper initialization block after all blocks from extends class(IB and Constructors)/Child Class");
    }

    public Child(int number, int parentNumber, int childNumber) {
        super(number, parentNumber);
        this.childNumber = childNumber;
        System.out.println("9. Constructor after all initialization block/Parent Class");
    }

    {
        System.out.println("8. Next initialization block (even if it after constructor)/Child Class");
    }
}
