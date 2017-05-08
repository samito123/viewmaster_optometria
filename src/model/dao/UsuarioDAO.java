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
			
			String sql = "select u.usuario_id, u.login, p.nome "
					+ "from tb_usuarios as u "
					+ "join tb_pessoas as p "
					+ "on p.pessoa_id = u.fk_pessoa "
					+ "where u.login = ? and u.senha = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			rs = ps.executeQuery();
			
			while(rs.next()){
				usuario = new Usuario();
				usuario.setUsuarioId(rs.getLong("u.usuario_id"));
				usuario.setLogin(rs.getString("u.login"));
				usuario.setNome(rs.getString("p.nome"));
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
