package day01;

import java.sql.*;

public class NavigatingQueryResultFlex {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@34.207.67.207:1521:XE";
        String username = "hr";
        String password = "hr";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("CONNECTION WAS SUCCESSFUL!");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM REGIONS");
            resultSet.next();
            System.out.println("Region ID on first row is " + resultSet.getString(1));
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_ID"));
            System.out.println("Region ID on second row is " + resultSet.getString(2));
            System.out.println("Region ID on second row is " + resultSet.getString("REGION_NAME"));
            resultSet.next();
            System.out.println("Region ID on next row is " + resultSet.getString("REGION_NAME"));
            resultSet.next();
            System.out.println("Region ID on next row is " + resultSet.getString("REGION_NAME"));
            resultSet.next();
            System.out.println("Region ID on next row is " + resultSet.getString("REGION_NAME"));
//            resultSet.next();
//            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));
            System.out.println(resultSet.next());
            resultSet.previous();
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));
            resultSet.absolute(2);
            System.out.println("Region ID on second row is " + resultSet.getString("REGION_NAME"));
            resultSet.first();
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));
            resultSet.last();
            System.out.println("Region ID on last row is " + resultSet.getString("REGION_NAME"));

            resultSet.beforeFirst();
            resultSet.next();
            System.out.println("Region ID on first row is " + resultSet.getString("REGION_NAME"));

            resultSet.afterLast();
            resultSet.previous();
            System.out.println("Region ID on last row is " + resultSet.getString("REGION_NAME"));



        } catch (SQLException e) {
            System.out.println("ERROR HAS OCCURRED " + e.getMessage());
        }
    }
}
