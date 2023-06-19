package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.LoginFlap;
import br.com.fiap.singleton.ConnectionManager;

public class OracleLoginFlapDAO{

    private Connection conexao;

    public OracleLoginFlapDAO() {
        this.conexao = ConnectionManager.getConnection();
    }

    public void insert(LoginFlap login) throws SQLException {
        String sql = "INSERT INTO login (usuario, senha) VALUES (?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, login.getUsuario());
        stmt.setString(2, login.getSenha());

        stmt.executeUpdate();
        stmt.close();
    }

    public List<LoginFlap> select() throws SQLException {
        List<LoginFlap> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM login ORDER BY usuario";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            LoginFlap login = new LoginFlap();
            login.setUsuario(rs.getString("usuario"));
            login.setSenha(rs.getString("senha"));
            usuarios.add(login);
        }

        rs.close();
        stmt.close();
        return usuarios;
    }

    public LoginFlap selectById(String usuario) throws SQLException {
        LoginFlap login = null;
        String sql = "SELECT * FROM login WHERE usuario=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, usuario);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            login = new LoginFlap();
            login.setUsuario(rs.getString("usuario"));
            login.setSenha(rs.getString("senha"));
        }

        rs.close();
        stmt.close();
        return login;
    }

    public void delete(String usuario) throws SQLException {
        String sql = "DELETE FROM login WHERE usuario=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, usuario);
        stmt.executeUpdate();
        stmt.close();
    }

    public void update(LoginFlap login) throws SQLException {
        String sql = "UPDATE login SET senha=? WHERE usuario=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, login.getSenha());
        stmt.setString(2, login.getUsuario());
        stmt.executeUpdate();
        stmt.close();
    }

}
