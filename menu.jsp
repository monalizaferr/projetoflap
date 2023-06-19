<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Flap - bolso amigo</title>
    <%@ include file="header.jsp" %>
</head>
<style>
    html, body {
      height: 100%;
      margin: 0;
      padding: 0;
    }
    
    .card-title {
      color: blue;
      font-family: 'Arial Black', Arial, sans-serif;
      font-size: smaller;
    }
    .card {
      box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
      border-radius: 10px;
      margin:auto;
      }
      .container {
      margin-top: 20px;
    }
      
    .wrapper {
      min-height: 100%;
      position: relative;
    }
    .content {
      padding-bottom: 60px; /* Altura do footer */
    }
    .footer {
      position: absolute;
      bottom: 0;
      width: 100%;
      height: 60px; /* Altura do footer */
      background-color: black;
      color: white;
      text-align: center;
    }
</style>

<div class="container content">
    <div class="row justify-content-center" style="background-color: #00FFFF; margin: auto;">
      <div class="col">
        <div class="card my-3" style="max-width: 200px;">
          <a href="menu.jsp"><img src="home.png" class="card-img-top" alt="Menu"></a>
          <div class="card-body">
            <h5 class="card-title text-center">MENU</h5>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card my-3" style="max-width: 200px;">
          <a href="carteira.jsp"><img src="carteira.png" class="card-img-top" alt="Carteira"></a>
          <div class="card-body">
            <h5 class="card-title text-center">CARTEIRA</h5>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card my-3" style="max-width: 200px;">
          <a href="detalhamento.jsp"><img src="detalhamento.png" class="card-img-top" alt="Detalhamento"></a>
          <div class="card-body">
            <h5 class="card-title text-center">DETALHAMENTO</h5>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card my-3" style="max-width: 200px;">
          <a href="grafico.jsp"><img src="grafico.png" class="card-img-top" alt="Gráfico"></a>
          <div class="card-body">
            <h5 class="card-title text-center">GRÁFICO</h5>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
<footer>
<%@ include file="footer.jsp" %>
</footer>
</html>
