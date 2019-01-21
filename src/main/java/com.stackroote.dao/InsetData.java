package com.stackroote.dao;


import java.sql.*;

public class InsetData {
    Connection con;

    public void insertData(String username, String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/login", "amrit", "root");
            PreparedStatement ps = con.prepareStatement("insert into amrit values(?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            int result = ps.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
}