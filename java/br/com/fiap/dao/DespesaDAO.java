package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.beans.CategoriaGastos;
import br.com.fiap.exception.DBException;

public interface DespesaDAO {
	
	void cadastrar (CategoriaGastos gastos) throws DBException;
	void atualizar (CategoriaGastos gastos) throws DBException;
	void remover (CategoriaGastos gastos) throws DBException;
	CategoriaGastos buscar (int IdGastos);
	List <CategoriaGastos> listar();
	void cadastrarDespesa(CategoriaGastos categoriaGastos) throws DBException;
	void inserirCategoriaGastos(CategoriaGastos categoriaGastos);

}
