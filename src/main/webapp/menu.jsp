


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Menu Principal</title>
    <style>
        body {
            background-color: #ffc0cb;
            font-family: Arial, sans-serif;
            text-align: center;
        }

        h1 {
            color: gold;
        }

        a {
            display: inline-block;
            margin: 10px;
            padding: 10px 20px;
            background-color: gold;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        a:hover {
            background-color: #ffd700;
        }
    </style>
</head>
<body>
<h1>Menu Principal</h1>
<a href="registrar_producto.jsp">Registrar Producto</a>
<a href="ConsultarProductosServlet">Consultar Productos</a>
<a href="eliminar_producto.jsp">Eliminar Producto</a>
</body>
</html>
