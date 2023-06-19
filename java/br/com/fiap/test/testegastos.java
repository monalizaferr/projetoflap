package br.com.fiap.test;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.beans.CategoriaGastos;
import br.com.fiap.dao.DespesaDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.DAOFactory;

public class testegastos {

    public static void main(String[] args) throws SQLException {

        DespesaDAO dao = DAOFactory.getDespesaDAO();

        CategoriaGastos jose = new CategoriaGastos();

        try {
            dao.cadastrar(jose);
            System.out.println("Despesas cadastrada");
        } catch (DBException e) {
            e.printStackTrace();
        }

        jose = dao.buscar(1);
        jose.setIdGastos(8L);
        jose.setAgua(100);
        jose.setLuz(150);
        jose.setMercado(600);
        jose.setCartao(1000);
        jose.setBesteiras(20);
        jose.setOutros(50);
        jose.setGastosgeral(1920);

        try {
            dao.atualizar(jose);
            System.out.println("Despesas atualizada");
        } catch (DBException e) {
            e.printStackTrace();
        }

        List<CategoriaGastos> lista = dao.listar();
        for (CategoriaGastos item : lista) {
            System.out.println(item.getIdGastos() + " " + item.getAgua() + "" + item.getLuz() + ""
            		+ item.getMercado() +"" + item.getCartao()+ "" + item.getBesteiras()+"" + 
            		item.getOutros()+ "" + item.getGastosgeral()+ "");
        }

        try {
            dao.remover(jose);
            System.out.println("Despesas removida");
        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}

		
	

		
	