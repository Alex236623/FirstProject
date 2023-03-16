package com.ua.robot.lesson18.test;

import java.util.Arrays;

public class MyArrayListWithMyList<Element> implements MyList<Element> {
    private static final Object[] EMPTY_ELEMENTDATA = {};
    Object[] objects;


    @Override
    public Object[] add(Element o) {
        if (objects == null) {
            objects =  EMPTY_ELEMENTDATA;
            objects[0]=  o;
        } else {
            Object[] newObject = objects;

            for (int i = 0; i < objects.length-1 ; i++) {
                System.out.println(objects.length);
                objects[i] = newObject[i];
            }

            objects[objects.length - 1] = o;
        }
        return objects;

    }

    @Override
    public boolean remove(Object[] object) {

        return false;
    }

    @Override
    public boolean remove(Object object) {

        return false;
    }

    @Override
    public Element remove(int index) {
        int count1 = 0;
        int count2 = 0;
        Object[] newObjects = objects;
        for (Object element : objects) {
            count1++;
            if (equals(index) == equals(element)) {
                count2++;
                objects[count1 - 1] = null;
            }
        }
        int count3 = 0;
        for (int i = 0; i < newObjects.length; i++) {
            if (newObjects != null) {
                objects[count3] = newObjects[i];
                count3++;

            }


        }
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Element get(Object object) {
        return null;
    }


    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object o) {
        return null;
    }

    @Override
    public void add(int index, Object o) {
        Object[] newObjects = objects;

        for (int i = 0; i < index; i++) {
            objects[i] = newObjects[i];
        }
        objects[index] = (Element) o;
        for (int i = 0; i < objects.length - 1; i++) {
            objects[i + 1] = newObjects[i];

        }
    }

    @Override
    public String toString() {
        return "MyArrayListWithMyList{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
