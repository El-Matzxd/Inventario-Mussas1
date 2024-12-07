package com.prototipo.inventariomussas1;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        ConexionBD conexionBD = new ConexionBD();
        Connection conexion = conexionBD.conectar();

        if (conexion != null) {
            System.out.println("Conexion Exitosa a BD");
        } else {
            System.out.println("Error al conectar a BD");
        }
    }
}
