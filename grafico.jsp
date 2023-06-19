<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>FLAP - BOLSO AMIGO</title>
  <%@ include file="header.jsp" %>
  <!-- Inclua a biblioteca Chart.js -->
  </head>
<body>
  <div class="container">
    <h1>Gráfico</h1>
    <canvas id="myChart"></canvas>
  </div>
 
  <script>
    // Dados do gráfico
    var agua = <%= request.getParameter("agua") %>;
    var luz = <%= request.getParameter("agua") %>;
    var mercado = <%= request.getParameter("mercado") %>;
    var cartao = <%= request.getParameter("cartao") %>;
    var besteiras = <%= request.getParameter("besteiras") %>;
    var outros = <%= request.getParameter("outros") %>;

    // Configuração do gráfico
    var config = {
      type: 'pie',
      data: {
        labels: ['Água', 'Mercado', 'Cartão', 'Besteiras', 'Outros'],
        datasets: [{
          data: [agua, mercado, cartao, besteiras, outros],
          backgroundColor: [
            '#FF6384',
            '#36A2EB',
            '#FFCE56',
            '#33FF7A',
            '#B232FF'
          ]
        }]
      },
      options: {
        responsive: true
      }
    };

    // Criação do gráfico
    window.onload = function() {
      var ctx = document.getElementById('myChart').getContext('2d');
      new Chart(ctx, config);
    };
  </script>
  <a href="menu.jsp">Voltar</a>
</body>
<footer>
<%@ include file="footer.jsp" %>
</footer>
</html>