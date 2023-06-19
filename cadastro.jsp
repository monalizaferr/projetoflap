<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cadastro de Novo Usuário - FLAP</title>
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
        font-size:25px;
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
        <h1>CADASTRO USUÁRIO</h1>

        <form action="CadastroServlet" method="post">
            <div class="input-container">
                <input type="text" id="nome" name="nome" placeholder="Nome" required>
            </div>
            <div class="input-container">
                <input type="text" id="email" name="email" placeholder="E-mail" required>
            </div>
            <div class="input-container">
                <input type="text" id="telefone" name="telefone" placeholder="Telefone" required>
            </div>
            <div class="input-container">
                <input type="password" id="senha" name="senha" placeholder="Senha" required>
            </div>
            <div>
                <input type="submit" value="Cadastrar">
            </div>
        </form>
        
        <p class="small">Já possui um login? <a href="loginflap.jsp">Faça o login</a></p>
    </div>
</body>
</html>
