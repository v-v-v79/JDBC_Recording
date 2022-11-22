package day01;

import java.sql.*;

public class ResultSetMetaData_ForColumns {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@34.207.67.207:1521:XE";
        String username = "hr";
        String password = "hr";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("CONNECTION WAS SUCCESSFUL!");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM REGIONS");


        } catch (SQLException e) {
            System.out.println("ERROR HAS OCCURRED " + e.getMessage());
        }
    }
}
