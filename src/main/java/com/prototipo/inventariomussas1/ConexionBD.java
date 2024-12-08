

package mus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/InventarioMussas";
    private static final String USER = "root";
    private static final String PASSWORD = "Acti1";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el driver *recuerda que no funciona sin esto :'v*
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
