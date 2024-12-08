

package mus;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrarProductoServlet")
public class RegistrarProductoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String cantidadStr = request.getParameter("cantidad");
        String marca = request.getParameter("marca");

        try {
            int cantidad = Integer.parseInt(cantidadStr); // Convertir a entero

            Connection conn = ConexionBD.getConnection();
            String query = "INSERT INTO productos (nombre, cantidad, marca) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nombre);
            stmt.setInt(2, cantidad);
            stmt.setString(3, marca);

            stmt.executeUpdate();
            conn.close();

            response.getWriter().println("Producto Registrado :)");
        } catch (NumberFormatException e) {
            response.getWriter().println("Error: Cantidad solo Admite NUMEROS");
        } catch (SQLException e) {
            response.getWriter().println("Error en la Conexion a BD");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            response.getWriter().println("Error del Driver(otra vez)");
            e.printStackTrace();
        }
    }
}

