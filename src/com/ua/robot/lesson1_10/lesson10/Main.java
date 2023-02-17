package com.ua.robot.lesson1_10.lesson10;


public class Main {
    public static void main(String[] args) {

        Teacher itTeacher = new Teacher("John Doe", "IT Teacher", 50, 100);

        Teacher youngItTeacher = new Teacher();
        youngItTeacher.setName("John Doe Jr");
        youngItTeacher.setProfession("IT Teacher");
        youngItTeacher.setAge(20);
        youngItTeacher.setSkillToTeach(50);

        Student student = new Student("Bill", 18, 0);

        Student student2 = new Student();
        student2.setName("Bob");
        student2.setAge(18);
        student2.setSkill(0);

        itTeacher.teach(student);
        youngItTeacher.teach(student2);



        // create array by set size, min value and max value
        ArrayHelper arrayHelper = new ArrayHelper();
        arrayHelper.createArray(10, -100, 130);
        arrayHelper.sortFromMax();
        arrayHelper.println();
        arrayHelper.sortFromMin();
        arrayHelper.println();

        //2. work throw array already created array @myArray
        int[] myArray = {25, 15, 2, 115, 15, 2, -246, -47, 2, 3};
        ArrayHelper myArray2 = new ArrayHelper(myArray);
        myArray2.sortFromMax();
        myArray2.println();
        myArray2.sortFromMin();
        myArray2.println();

        //3. set array throw instance
        ArrayHelper myArray3 = new ArrayHelper(10, 5, 12);
        myArray3.sortFromMax();
        myArray3.println();
        myArray3.sortFromMin();
        myArray3.println();

        //4. set array throw setter
        int[] myArr = {-18, 27, 13, 8, 118, -48, -13, 8};
        ArrayHelper myArray4 = new ArrayHelper();
        myArray4.setArray(myArr);
        myArray4.sortFromMax();
        myArray4.println();
        myArray4.sortFromMin();
        myArray4.println();


    }

}







