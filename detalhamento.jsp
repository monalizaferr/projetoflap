<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Flap - bolso amigo</title>
  <%@ include file="header.jsp" %>
</head>
<body>
   <div class="container">
    <h1>Detalhamento de Gastos</h1>
    <table class="table">
      <thead>
        <tr>
          <th>ÁGUA</th>
          <th>LUZ</th>
          <th>MERCADO</th>
          <th>CARTÃO</th>
          <th>BESTEIRAS</th>
          <th>OUTROS</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>${requestScope.agua}</td>
          <td>${requestScope.luz}</td>
          <td>${requestScope.mercado}</td>
          <td>${requestScope.cartao}</td>
          <td>${requestScope.besteiras}</td>
          <td>${requestScope.outros}</td>
        </tr>
      </tbody>
    </table>
    <a href="menu.jsp">Voltar</a>
  </div>
</body>
<footer>
<%@ include file="footer.jsp" %>
</footer>
</html>
﻿