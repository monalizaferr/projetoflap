package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.beans.Flap;
import br.com.fiap.exception.DBException;

public interface FlapDAO {
	
	void cadastrar (Flap usuario) throws DBException;
	void atualizar (Flap usuario) throws DBException;
	void remover (int codigo) throws DBException;
	Flap buscar (int id);
	List <Flap> listar();

}
