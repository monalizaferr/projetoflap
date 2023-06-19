<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Página de Login FLAP</title>
</head>
<style>
    body {
        background-color: #00FFFF;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
        padding: 0;
    }

    .container {
        background-color: #002366;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    .input-container {
        margin-bottom: 10px;
        text-align: center;
    }

    input[type="text"],
    input[type="password"] {
        border: none;
        border-radius: 4px;
        padding: 10px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
        width: 200px;
    }

    h1, p {
        font-family: 'Tahoma', Arial, sans-serif;
        color: #00FFFF;
        margin-top: 0;
    }

    p.small {
        font-size: 14px;
        margin-top: 10px;
    }

    a {
        text-decoration: none;
        color: #00FFFF;
    }
</style>

<body>
    <div class="container">
        <img src="logo2.png" alt="Logo FLAP" width="300" height="300">
        <h1>FLAP</h1>
        <p>Seu bolso amigo</p>

        <%-- Verifica se ocorreu um erro de login --%>
        <% if (request.getParameter("error") != null) { %>
            <p style="color: red;">Credenciais inválidas. Tente novamente.</p>
        <% } %>

        <form action="LoginServlet" method="post">
            <div class="input-container">
                <input type="text" id="username" name="username" placeholder="Usuário" required>
            </div>
            <div class="input-container">
                <input type="password" id="password" name="password" placeholder="Senha" required>
            </div>
            <div>
                <input type="submit" value="Login">
            </div>
        </form>
        
        <p class="small">Não possui um login? <a href="cadastro.jsp">Criar novo login</a></p>
    </div>
</body>
</html>

