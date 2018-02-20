
package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
    private static final String SQCONN = "jdbc:sqlite:school.sqlite";
    private  static Connection getConnection(){
        try

        Class.forName("org.sqlite.JDBC");
        return DriverManager.getconnection (SQCONN);
    }//class