package co.edu.sena.projectjdb2687350.util;

import java.sql.*;

import static java.sql.DriverManager.*;

public class BasicConnection {

    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/bancodivisas?serverTimezone=America/Bogota";
        String username = "admin";
        String password = "juano23";
        String sql = null;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            sql = "SELECT * FROM bancodivisas.users";
            conn =
                    getConnection(url,
                            username, password);
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");

                System.out.println(rs.getString("user_lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }// end try-catch
    } // main
} // BasicConnection



