package control.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.classes.Usuario;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		//switch (req.getParameter("chave")) {
		//case "ValidaLogin":
			/*Usuario usuario = new Usuario();
			usuario.setLogin("Sam");
			usuario.setSenha("123");
			boolean loginValido = usuario.ValidaLogin();
			PrintWriter out = resp.getWriter();
			out.write(""+loginValido);
			out.close();*/
				
			req.setAttribute("mensagem", "Post salvo com sucesso!");
	        RequestDispatcher rd = req.getRequestDispatcher("Login");
	        rd.forward(req, resp);	
			
			//break;

		//}
		
	}
}
