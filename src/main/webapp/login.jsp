

<!DOCTYPE html>
<html>
<head>
    <title>Login - Inventario Mussas</title>
    <style>
        body {
            background-color: #ffc0cb;
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        h1 {
            color: gold;
        }
        form {
            display: inline-block;


            padding: 20px;
            border: 2px solid gold;
            border-radius: 10px;
            background-color: white;
        }
        input {
            display: block;
            margin: 10px auto;
            padding: 10px;
            width: 80%;
            border: 1px solid gray;
            border-radius: 5px;
        }
        button {
            background-color: gold;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: darkgoldenrod;
        }
    </style>
</head>
<body>
<h1>Login Page</h1>
<form method="post" action="LoginServlet">
    <input type="text" name="username" placeholder="Nombre de Usuario">
    <input type="password" name="password" placeholder="Contraseña">
    <button type="submit">Iniciar Sesion</button>
</form>
<% if (request.getParameter("error") != null) { %>
<p style="color: red;">Credenciales Incorrectas :(</p>
<% } %>
</body>
</html>
