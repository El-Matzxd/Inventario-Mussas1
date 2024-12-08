package mus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/inventariomussas";
    private static final String USER = "root";
    private static final String PASSWORD = "Acti1";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la bd: " + e.getMessage());
            return null;
        }
    }
}
