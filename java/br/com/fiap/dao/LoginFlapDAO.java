package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.beans.LoginFlap;
import br.com.fiap.exception.DBException;


public interface LoginFlapDAO {
	
	void cadastrar (LoginFlap login) throws DBException;
	void atualizar (LoginFlap login) throws DBException;
	void remover (int codigo) throws DBException;
	LoginFlap buscar (int id);
	List <LoginFlap> listar();
	void insert(LoginFlap jose);

}