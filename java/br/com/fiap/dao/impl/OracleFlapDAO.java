package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Flap;
import br.com.fiap.singleton.ConnectionManager;


public class OracleFlapDAO {

    private Connection conexao;

    public OracleFlapDAO() {
    	this.conexao = ConnectionManager.getConnection();
    }

    // Inserir um usuário no banco
    public void insert(Flap usuario) throws SQLException {
        String sql = "INSERT INTO usuario (id, nome, email, senha, telefone, data) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setLong(1, usuario.getId());
        stmt.setString(2, usuario.getNome());
        stmt.setString(3, usuario.getEmail());
        stmt.setString(4, usuario.getSenha());
        stmt.setInt(5, usuario.getTelefone());
        stmt.setDate(6, usuario.getData());

        stmt.execute();
        stmt.close();
    }

    // Buscar todos os usuários do banco
    public List<Flap> select() throws SQLException {
        List<Flap> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario ORDER BY nome";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Flap usuario = new Flap();
            usuario.setId(rs.getLong("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setEmail(rs.getString("email"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setTelefone(rs.getInt("telefone"));
            usuario.setData(rs.getDate("data"));

            usuarios.add(usuario);
        }

        rs.close();
        stmt.close();
        return usuarios;
    }

    // Buscar um único usuário pelo ID
    public Flap selectById(Long id) throws SQLException {
        Flap usuario = null;
        String sql = "SELECT * FROM usuario WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            usuario = new Flap();
            usuario.setId(rs.getLong("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setEmail(rs.getString("email"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setTelefone(rs.getInt("telefone"));
            usuario.setData(rs.getDate("data"));
        }

        rs.close();
        stmt.close();
        return usuario;
        
    }

    // Excluir um usuário pelo ID
    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM usuario WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1, id);
        stmt.execute();
        stmt.close();
    }

    // Alterar um usuário informado pelo ID
    public void update(Flap usuario) throws SQLException {
        String sql = "UPDATE usuario SET nome=?, email=?, senha=?, telefone=? WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getSenha());
        stmt.setInt(4, usuario.getTelefone());
        stmt.setLong(5, usuario.getId());

        stmt.execute();
        stmt.close();
    }
}
