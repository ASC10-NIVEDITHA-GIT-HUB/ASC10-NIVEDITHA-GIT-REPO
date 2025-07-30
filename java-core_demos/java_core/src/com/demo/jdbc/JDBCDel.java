package com.demo.jdbc;

import java.sql.*;

public class JDBCDel {
    public static void main (String[] args){
        Connection connection = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver loaded!");

            String url= "jdbc:sqlserver://localhost:1433;databaseName=MyFriendsDB;user=sa;password=sqlserver;trustServerCertificate=true;";

            connection = DriverManager.getConnection(url);
            System.out.println("Connection established");
            Statement statement=connection.createStatement();
            System.out.println("Statement created");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM FriendsList");
            System.out.println("result set returned");

            resultSet.next();
            int friend_id=resultSet.getInt("friend_id");
            System.out.println(friend_id);

            String Fname = resultSet.getString("Fname");
            System.out.println(Fname);

        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
