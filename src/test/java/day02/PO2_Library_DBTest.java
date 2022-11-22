package day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utility.DB_Util;

public class PO2_Library_DBTest {

    // Create connection to MySQL Database
    String url = "jdbc:mysql://34.230.35.214:3306/library2";
    String username = "library2_client";
    String password = "6s2LQQTjBcGFfDhY";

    @Test
    public void task1() {

        //create connection
        DB_Util.createConnection(url, username, password);

        //Run Query
        DB_Util.runQuery("select count(*) from books");

        //Get data from DB
        String bookCount = DB_Util.getFirstRowFirstColumn();
        System.out.println(bookCount);

        //Get data from UI
        String bookCountUI = "3963";

        //compare
        Assertions.assertEquals(bookCount, bookCountUI);

        //close connection
        DB_Util.destroy();
    }
}
