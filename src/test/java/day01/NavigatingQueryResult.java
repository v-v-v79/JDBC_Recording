package day01;

import java.sql.*;

public class NavigatingQueryResult {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@34.207.67.207:1521:XE";
        String username = "hr";
        String password = "hr";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("CONNECTION WAS SUCCESSFUL!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM REGIONS");
            resultSet.next();
            System.out.println("Region ID on first row is " + resultSet.getString(1));
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_ID"));
            System.out.println("Region ID on first row is " + resultSet.getString(2));
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));
            resultSet.next();
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));
            resultSet.next();
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));
            resultSet.next();
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));
//            resultSet.next();
//            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));
            System.out.println(resultSet.next());



        } catch (SQLException e) {
            System.out.println("ERROR HAS OCCURRED " + e.getMessage());
        }
    }
}
