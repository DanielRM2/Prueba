package com.ed.ecommerce.mvcDemo.Pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBD {

    private static String URL = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10775313?useSSL=false&serverTimezone=UTC";
    private static String USER = "sql10775313";
    private static String PASSWORD = "tSRDSSVzft";
    private static Connection con;

    public static Connection getConexion() throws SQLException {

        con = DriverManager.getConnection(URL,USER, PASSWORD);

        return con;
    }

}
