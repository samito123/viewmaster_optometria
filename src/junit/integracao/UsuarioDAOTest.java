package junit.integracao;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import model.classes.Pessoa;
import model.classes.Usuario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import control.auxiliares.ManipulaData;
import control.factory.FabricaDeConexao;

public class UsuarioDAOTest {

	Connection conn;
	
	@Before
	public void ControiCenarioTabelaUsuario(){
		try {
			conn = new FabricaDeConexao().getConnection();
			conn.setAutoCommit(false);
			InserePessoa();
			InsereUsuario();
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
	
	private Pessoa CriaMockDePessoa() throws ParseException{
		Pessoa pessoa = mock(Pessoa.class);
		when(pessoa.getPessoaId()).thenReturn((long) -1);
		when(pessoa.getNome()).thenReturn("nomeTeste");
		when(pessoa.getSexo()).thenReturn("M");
		when(pessoa.getEmail()).thenReturn("emailTeste");
		when(pessoa.getDataDeNascimento()).thenReturn(new ManipulaData().SetDateParaTestes());
		return pessoa;
	}
	
	private Usuario CriaMockDeUsuario() throws ParseException{
		Usuario usuario = mock(Usuario.class);
		when(usuario.getUsuarioId()).thenReturn((long) -1);
		when(usuario.getPessoaId()).thenReturn((long) -1);
		when(usuario.getLogin()).thenReturn("loginTeste");
		when(usuario.getSenha()).thenReturn("senhaTeste");
		return usuario;
	}
	
	private void InserePessoa() throws SQLException, ParseException{
		Pessoa pessoa = CriaMockDePessoa();
		PreparedStatement ps = null;
		try{
			String sql = "insert into tb_pessoas "
					+ "(pessoa_id, nome, sexo, email, data_de_nascimento) "
					+ "values (?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setLong(1, -1); 
			ps.setString(2, pessoa.getNome()); 
			ps.setString(3, pessoa.getSexo()); 
			ps.setString(4, pessoa.getEmail()); 
			ps.setDate(5, new java.sql.Date(pessoa.getDataDeNascimento().getTime()));
			ps.execute(); 
		}catch(Exception e){
			System.out.println(e);
		}finally{
			ps.close();
		}
	}
	
	private void InsereUsuario() throws SQLException, ParseException{
		Usuario usuario = CriaMockDeUsuario();
		PreparedStatement ps = null;
		try{
			String sql = "insert into tb_usuarios "
					+ "(usuario_id, login, senha, fk_pessoa) "
					+ "values (?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setLong(1, -1); 
			ps.setString(2, usuario.getLogin()); 
			ps.setString(3, usuario.getSenha()); 
			ps.setLong(4, usuario.getPessoaId()); 
			ps.execute(); 
		}catch(Exception e){
			System.out.println(e);
		}finally{
			ps.close();
		}
	}
	
	@After
	public void FechaCenario() throws SQLException{
		conn.rollback();
		conn.close();
	}
	
	@Test
	public void BuscarUsuario() throws SQLException{
		Usuario usuario = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			String sql = "select u.usuario_id, u.login, p.nome "
					+ "from tb_usuarios as u "
					+ "join tb_pessoas as p "
					+ "on p.pessoa_id = u.fk_pessoa "
					+ "where u.login = ? and u.senha = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, "loginTeste");
			ps.setString(2, "senhaTeste");
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
		assertEquals(usuario.getUsuarioId(), -1);
		assertEquals(usuario.getNome(), "nomeTeste");
	};

}
