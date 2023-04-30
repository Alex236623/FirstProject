package com.ua.robot.lesson31;

//Опціональна домашка по рефлексії:
//створити клас з 9 полями. (неважливо що за клсс та поля)
//всі поля мають бути с разними модифікаторами (наприкла 2 паблік, 4 прайват, 1 протектед і т.д.)
//за допомогою рефлексії проаналізувати цей клас і зберігти в 4 лісти ці фалди. 1 ліст з прайват, другий с протектед ві т.д
public class TestObject {

    public int publicInt;
    public String publicString;
    private int privateInt;
    private String privateString;
    private boolean privateBoolean;
    private long privateLong;
    protected int protectedInt;
    protected String protectedString;
    int simpleInt;

    @Override
    public String toString() {
        return "TestObject{" +
                "publicInt=" + publicInt +
                ", publicString='" + publicString + '\'' +
                ", privateInt=" + privateInt +
                ", privateString='" + privateString + '\'' +
                ", privateBoolean=" + privateBoolean +
                ", privateLong=" + privateLong +
                ", protectedInt=" + protectedInt +
                ", protectedString='" + protectedString + '\'' +
                ", simpleInt=" + simpleInt +
                '}';
    }
}
