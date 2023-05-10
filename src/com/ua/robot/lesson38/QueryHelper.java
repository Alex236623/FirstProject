package com.ua.robot.lesson38;

public class QueryHelper {
    public String selectAllFromTable(String table) {
        return "SELECT * FROM '" + table + "'";
    }

    public String where(String item) {
        return " WHERE '" + item + "'";
    }

    public String andWhere(String item) {
        return "AND WHERE '" + item + "'";
    }

    public String like(String item) {
        return "LIKE '" + item + "'";
    }

    public String insertInTable(String table) {
        return "INSERT INTO '" + table + "'";
    }

    public String insertInColumn(String column) {
        return " ('" + column + "')";
    }

    public StringBuilder insertInColumns(String[] columns) {
        StringBuilder res = new StringBuilder("(");
        for (String column : columns) {
            res.append(column);
        }
        res.append("')");
        return res;
    }

    public String value(String item) {
        return " ('" + item + "')";
    }

    public StringBuilder Values(String[] values) {
        StringBuilder res = new StringBuilder("('");
        for (String value : values) {
            res.append(value);
        }
        res.append("')");
        return res;
    }
}
