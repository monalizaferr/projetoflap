package br.com.fiap.test;

import java.sql.SQLException;

import br.com.fiap.beans.LoginFlap;
import br.com.fiap.dao.LoginFlapDAO;
import br.com.fiap.dao.impl.OracleLoginFlapDAO;

public class TesteLoginFlap {

	public static void main(String[] args) {
		
		LoginFlapDAO dao = new OracleLoginFlapDAO();
		
		LoginFlap mariaeduarda = new LoginFlap();
		
		mariaeduarda.setUsuario("mariaeduarda");
		mariaeduarda.setSenha("1234578");
		
		try {
			dao.insert(mariaeduarda);
			System.out.println("Login inserido com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao inserir o login.");
			e.printStackTrace();
		}
	}
}

