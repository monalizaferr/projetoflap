<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Flap - bolso amigo</title>
    <%@ include file="header.jsp" %>
    <style>
        .small-label {
            font-size: 15px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>CADASTRE SUAS DESPESAS</h1>

    <c:if test="${not empty msg}">
        <div class="alert alert-success">${msg}</div>
    </c:if>
    <c:if test="${not empty erro}">
        <div class="alert alert-danger">${erro}</div>
    </c:if>

    <c:url value="/gastos" var="linkGastosServlet"></c:url>

    <form action="${linkGastosServlet}" method="post">
        <div class="form-group">
            <label for="id-agua" class="small-label">ÁGUA</label>
            <input type="text" class="form-control" id="id-agua" name="agua">
        </div>
        <div class="form-group">
            <label for="id-luz" class="small-label">LUZ</label>
            <input type="text" class="form-control" id="id-luz" name="luz">
        </div>
        <div class="form-group">
            <label for="id-mercado" class="small-label">MERCADO</label>
            <input type="text" class="form-control" id="id-mercado" name="mercado">
        </div>
        <div class="form-group">
            <label for="id-cartao" class="small-label">CARTÃO</label>
            <input type="text" class="form-control" id="id-cartao" name="cartao">
        </div>
        <div class="form-group">
            <label for="id-besteiras" class="small-label">BESTEIRAS</label>
            <input type="text" class="form-control" id="id-besteiras" name="besteiras">
        </div>
        <div class="form-group">
            <label for="id-outros" class="small-label">OUTROS</label>
            <input type="text" class="form-control" id="id-outros" name="outros">
        </div>
        <br>
        <input type="submit" value="Salvar" class="btn btn-primary">
    </form>
    <a href="menu.jsp">Voltar</a>
</div>
</body>
<footer>
<%@ include file="footer.jsp" %>
</footer>
</html>
