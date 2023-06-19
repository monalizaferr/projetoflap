package br.com.fiap.test;

import java.sql.SQLException;

import br.com.fiap.beans.Flap;
import br.com.fiap.dao.FlapDAO;
import br.com.fiap.dao.impl.OracleFlapDAO;

	public class testeflap {

	public static void main (String [] args) throws SQLException {
		
		OracleFlapDAO  dao = new OracleFlapDAO();
		
		Flap jose = new Flap();
		Flap maria = new Flap ();
		Flap silva = new Flap ();
		
		jose.setId(8L);
		jose.setNome("Jose");
		jose.setEmail("jose@gmail.com");
		jose.setSenha("123456");
		jose.setTelefone(1324567890);
		
		
		maria.setId(9L);
		maria.setNome("Maria");
		maria.setEmail("maria@gmail.com");
		maria.setSenha("123456");
		maria.setTelefone(556789656);
		
		silva.setId(11L);
		silva.setNome("Silva");
		silva.setEmail("silva@yahoo.com.br");
		silva.setSenha("123456");
		silva.setTelefone(3526789);
		
		//dao.insert(jose);
		//dao.insert(maria);
		
		dao.insert(silva);
		
		
	}

}

