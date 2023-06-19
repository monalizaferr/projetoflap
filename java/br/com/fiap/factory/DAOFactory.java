package br.com.fiap.factory;

import br.com.fiap.dao.DespesaDAO;
import br.com.fiap.dao.impl.OracleDespesaDAO;


public class DAOFactory {

    public static DespesaDAO getDespesaDAO() {
        return (DespesaDAO) new OracleDespesaDAO();
    }
}

