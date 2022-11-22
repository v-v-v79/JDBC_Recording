package day01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    /**
     * host: 34.207.67.207
     * port: 1521
     * SID:  XE
     * user: hr
     * pass: hr
     *
     * jdbs url AKA connection String
     * syntax:
     * jdbc : vendorName : driverType @YourHost:PORT:SID
     *
     * jdbc:oracle:thin:@34.207.67.207:1521:XE
     *
     */

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@34.207.67.207:1521:XE";
        String username = "hr";
        String password = "hr";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("CONNECTION WAS SUCCESSFUL!");
        } catch (SQLException e) {
            System.out.println("CONNECTION HAS FAILED " + e.getMessage());
        }
    }
}
