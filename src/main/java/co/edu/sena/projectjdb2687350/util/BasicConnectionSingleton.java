package co.edu.sena.projectjdb2687350.util;
import java.sql.*;

public class BasicConnectionSingleton {
    private static String url =
            "jdbc:mysql://localhost:3306/bancodivisas?serverTimezone=America/Bogota";
    private static String user = "admin";
    private static String pass = "juano23";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn =
                    DriverManager.getConnection(url, user,
                            pass);
        }
        return conn;
    }
} // BasicConnectionSingleton

