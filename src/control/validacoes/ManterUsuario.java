package control.validacoes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.classes.Usuario;
import model.dao.UsuarioDAO;

import com.google.gson.Gson;

import control.factory.FabricaDeConexao;
import control.servlet.GsonServlet;

public class ManterUsuario {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Connection conn;
	
	public ManterUsuario(HttpServletRequest request, HttpServletResponse response){
		this.request = request;
		this.response = response;
	}

	public void ValidaLogin() throws IOException, SQLException, ServletException{
		Usuario usuario = null;
		try{
			conn = new FabricaDeConexao().getConnection();
			conn.setAutoCommit(false);
			usuario = new UsuarioDAO(conn).
					BuscarUsuario(request.getParameter("login"), request.getParameter("senha"));
			conn.commit();
		}catch(Exception e){
			conn.rollback();
		}finally{
			conn.close();
			new GsonServlet(response).GsonUsuario(usuario);
		}
	}
	
}
