package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Verifique as credenciais do usuário
        if (checkCredentials(username, password)) {
            // Autenticação bem-sucedida, redirecione para a página de sucesso
            response.sendRedirect("sucesso.jsp");
        } else {
            // Credenciais inválidas, redirecione para a página de login com um parâmetro de erro
            response.sendRedirect("login.jsp?error=true");
        }
    }

    private boolean checkCredentials(String username, String password) {
        // Lógica para verificar as credenciais do usuário
        // Retorne true se as credenciais forem válidas e false caso contrário
        // Você pode implementar sua lógica de verificação de autenticação aqui
        // Por exemplo, comparar as credenciais com um banco de dados ou outro sistema de autenticação
        return username.equals("admin") && password.equals("admin");
    }
}

