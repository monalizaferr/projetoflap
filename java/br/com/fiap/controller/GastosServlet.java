package br.com.fiap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.buf.StringUtils;

import br.com.fiap.beans.CategoriaGastos;
import br.com.fiap.dao.DespesaDAO;
import br.com.fiap.factory.DAOFactory;

@WebServlet("/GastosServlet")
public class GastosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private DespesaDAO dao;
    private String linkGastosServlet = "gastos"; // Exemplo de uso da variável

    public void init() throws ServletException {
        super.init();
        dao = DAOFactory.getDespesaDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recupere os parâmetros enviados no formulário 
        float agua = parseFloat(request.getParameter("agua")); 
        float luz = parseFloat(request.getParameter("luz"));
        float mercado = parseFloat(request.getParameter("mercado"));
        float cartao = parseFloat(request.getParameter("cartao"));
        float besteiras = parseFloat(request.getParameter("besteiras"));
        float outros = parseFloat(request.getParameter("outros"));

        // Crie uma instância de CategoriaGastos e configure os valores dos atributos
        CategoriaGastos categoriaGastos = new CategoriaGastos();
        categoriaGastos.setAgua(agua);
        categoriaGastos.setLuz(luz);
        categoriaGastos.setMercado(mercado);
        categoriaGastos.setCartao(cartao);
        categoriaGastos.setBesteiras(besteiras);
        categoriaGastos.setOutros(outros);

        // Insira a categoria de gastos no banco de dados
        try {
            dao.inserirCategoriaGastos(categoriaGastos);
            // Redirecione para uma página de sucesso ou exiba uma mensagem de sucesso
            response.sendRedirect("sucesso.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Redirecione para uma página de erro ou exiba uma mensagem de erro
            response.sendRedirect("erro.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CategoriaGastos> lista = dao.listar();
        request.setAttribute("categoriagastos", lista);
        request.getRequestDispatcher("carteira.jsp").forward(request, response);
    }
    
    private static float parseFloat(String value) {
        try {
            return value == null ? 0f : Float.parseFloat(value.replaceFirst(",", "."));
        } catch (Exception e) {
            e.printStackTrace();
            return 0f;
        }
    }
}
