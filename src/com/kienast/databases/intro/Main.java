package com.kienast.databases.intro;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/maxkienast/Desktop/Education/Programming Courses/Java/Masterclass/JavaChallenges/" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            // conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("drop table if exists " + TABLE_CONTACTS);
            statement.execute(
                    "create table if not exists " + TABLE_CONTACTS +" (" +
                            COLUMN_NAME + " text, " +
                            COLUMN_PHONE + " integer, " +
                            COLUMN_EMAIL + " text)");

            insertContact(statement, "John", 1726482927, "john@mail.com");
            insertContact(statement, "Tom", 1753846281, "tom@mail.com");
            insertContact(statement, "Jane", 1217637826, "jane@mail.com");

            // statement.execute("select * from contacts");
            // ResultSet results = statement.getResultSet();

            ResultSet results = statement.executeQuery("select * from " + TABLE_CONTACTS +"");

            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                results.getInt(COLUMN_PHONE) + " " +
                                results.getString(COLUMN_EMAIL));
            }

            results.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong:" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute(
                "insert into " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") " +
                        "values ('" + name +"', '" + phone +"', '" + email +"')");
    }

}
