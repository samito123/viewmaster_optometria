package control.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import control.validacoes.ManterUsuario;
import model.classes.Usuario;
import model.dao.UsuarioDAO;

public class LoginServlet extends HttpServlet{

	private HttpServletRequest request;
	private HttpServletResponse response;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		switch (request.getParameter("chave")) {
		case "ValidaLogin":
			try {
				new ManterUsuario(request, response).ValidaLogin();
			} catch (SQLException e) {
				System.out.println("Erro LoginServlet-ValidaLogin: "+e);
			}
			break;
			
		default:
			String resposta = new CodificaUTF8().CodificaString("Chave inválida");
			PrintWriter out = response.getWriter();
			out.write(resposta); 
			out.flush();
			out.close();
			break;
		}
	}
}
