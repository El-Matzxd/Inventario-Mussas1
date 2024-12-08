

<%@ page import="java.util.List" %>
<%@ page import="mus.Producto" %>
<!DOCTYPE html>
<html>
<head>
    <title>Productos en el Inventario</title>
    <style>
        body {
            background-color: pink;
            font-family: Arial, sans-serif;
        }
        h1 {
            text-align: center;
        }
        table {
            width: 50%;
            margin: auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid gold;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: gold;
            color: black;
        }
    </style>
</head>
<body>
<h1>Productos en el Inventario</h1>
<table>
    <tr>
        <th>Nombre</th>
        <th>Cantidad</th>
        <th>Marca</th>
    </tr>
    <%
        Object productosAttr = request.getAttribute("productos");
        List<Producto> productos = null;
        if (productosAttr instanceof List<?>) {
            productos = (List<Producto>) productosAttr;
        }

        if (productos != null && !productos.isEmpty()) {
            for (Producto producto : productos) {
    %>
    <tr>
        <td><%= producto.getNombre() %></td>
        <td><%= producto.getCantidad() %></td>
        <td><%= producto.getMarca() %></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="3">El Inventario esta Vacio :(</td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
