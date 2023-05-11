package com.ua.robot.lesson38;

//Створити клас студент і за допомогою джава зберігати інформацію про студента в базі даних та прочитати її
public class Main {
    public static void main(String[] args) {
        MySqlConnection mySqlConnection = new MySqlConnection();
        mySqlConnection.open();

        QueryHelper queryHelper = new QueryHelper();

        //read
        String qry = queryHelper.selectAllFromTable("student") + queryHelper.where("name") + queryHelper.like("Ivan");
        mySqlConnection.findOne(qry);

        String qry2 = queryHelper.selectAllFromTable("student");
        mySqlConnection.findAll(qry2);


        //write
        String qry3 = queryHelper.insertInTable("student") + queryHelper.insertInColumn("name") + queryHelper.value("Alex");
        mySqlConnection.insert(qry3);


        mySqlConnection.close();
    }
}