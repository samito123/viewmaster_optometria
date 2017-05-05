package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import control.factory.FabricaDeConexao;
import model.classes.Usuario;

public class UsuarioDAO{

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public UsuarioDAO(Connection conn){
		this.conn = conn;
	}
	
	public Usuario BuscarUsuario(String login, String senha) throws SQLException {
		Usuario usuario = null;
		try {
			String sql = "select u.usuario_id "
					+ "from tb_usuario as u "
					+ "where login = ? and senha = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			rs = ps.executeQuery();
			
			while(rs.next()){
				usuario = new Usuario();
				usuario.setUsuarioId(rs.getLong("usuario_id"));
				//usuario.setLogin(rs.getString("login"));
				//usuario.setSenha(rs.getString("Senha"));
			}
			
		} catch (Exception e) {
			System.out.println("Erro BuscarUsuario: "+e);
		}finally{
			rs.close();
			ps.close();
		}
		return usuario;
	}

}
