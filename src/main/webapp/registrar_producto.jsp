
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registrar Producto</title>
    <style>
        body {
            background-color: #ffc0cb;
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
<h1>Registrar Producto</h1>
<form method="post" action="RegistrarProductoServlet">
    <input type="text" name="nombre" placeholder="Nombre del Producto" required><br>
    <input type="number" name="cantidad" placeholder="Cantidad" required><br>
    <input type="text" name="marca" placeholder="Marca" required><br>
    <button type="submit">Registrar</button>
</form>
</body>
</html>
