

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Eliminar Producto</title>
    <style>
        body {
            background-color: pink;
            font-family: Arial, sans-serif;
            text-align: center;
        }
        h1 {
            color: gold;
        }
        form {
            margin: 20px;
        }
        input, button {
            margin: 10px;
            padding: 10px;
            border: 1px solid gold;
            border-radius: 5px;
        }
        button {
            background-color: gold;
            color: white;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h1>Eliminar Producto del Inventario</h1>
<form method="post" action="EliminarProductoServlet">
    <input type="number" name="id" placeholder="ID del Producto" required><br>
    <button type="submit">Eliminar</button>
</form>
</body>
</html>
