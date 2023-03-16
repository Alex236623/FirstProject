package com.ua.robot.lesson18.test;


public interface MyList<Element> {


    Object[] add(Element element);

    boolean remove(Object[] object);

    boolean remove(Object object);

    void clear();

    Element get(Object object);

    Object get(int index);

    Element set(int index, Element element);

    void add(int index, Element element);

    Element remove(int index);

}
