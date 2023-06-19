package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.beans.CategoriaGastos;
import br.com.fiap.dao.DespesaDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.ConnectionManager;

public class OracleDespesaDAO implements DespesaDAO {

    private Connection connection;

    public OracleDespesaDAO() {
        connection = ConnectionManager.getConnection();
    }

    public void cadastrarDespesa(CategoriaGastos categoriaGastos) throws DBException {
        PreparedStatement stmt = null;

        try {
            String sql = "INSERT INTO TB_DESPESA (agua, luz, mercado, cartao, besteiras, outros) VALUES (?, ?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(sql);
            stmt.setFloat(1, categoriaGastos.getAgua());
            stmt.setFloat(2, categoriaGastos.getLuz());
            stmt.setFloat(3, categoriaGastos.getMercado());
            stmt.setFloat(4, categoriaGastos.getCartao());
            stmt.setFloat(5, categoriaGastos.getBesteiras());
            stmt.setFloat(6, categoriaGastos.getOutros());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DBException("Erro ao cadastrar despesa.");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

	@Override
	public void cadastrar(CategoriaGastos gastos) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(CategoriaGastos gastos) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(CategoriaGastos gastos) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CategoriaGastos buscar(int IdGastos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoriaGastos> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}

