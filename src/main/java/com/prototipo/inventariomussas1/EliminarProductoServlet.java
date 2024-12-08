
package mus;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EliminarProductoServlet")
public class EliminarProductoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String idStr = request.getParameter("id");

        try {
            int id = Integer.parseInt(idStr); // ID a entero

            Connection conn = ConexionBD.getConnection();
            String query = "DELETE FROM productos WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();
            conn.close();

            if (rowsAffected > 0) {
                out.println("Producto Eliminado :)");
            } else {
                out.println("No se encontró ningún producto con ese ID.");
            }
        } catch (NumberFormatException e) {
            out.println("Error: el campo de ID solo Admite NUMEROS");
        } catch (SQLException e) {
            out.println("Error al conectar con BD");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            out.println("Error del Driver");
            e.printStackTrace();
        }
    }
}
