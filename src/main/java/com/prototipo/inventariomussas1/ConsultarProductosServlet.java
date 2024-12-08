
package mus;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConsultarProductosServlet")
public class ConsultarProductosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Producto> productos = new ArrayList<>();
        try (Connection conn = ConexionBD.getConnection()) {
            String query = "SELECT id, nombre, cantidad, marca FROM productos";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setMarca(rs.getString("marca"));
                productos.add(producto);
            }

            // Enviar productos al JSP
            request.setAttribute("productos", productos);
            request.getRequestDispatcher("consultar_productos.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("error", "Error al conectar con BD");
            request.getRequestDispatcher("consultar_productos.jsp").forward(request, response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("error", "Error de driver");
            request.getRequestDispatcher("consultar_productos.jsp").forward(request, response);
        }
    }
}

