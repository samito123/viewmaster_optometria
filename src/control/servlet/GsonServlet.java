package control.servlet;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.classes.Usuario;
import model.interfaces.GsonServletInterface;

public class GsonServlet implements GsonServletInterface{

	private HttpServletResponse response;
	
	public GsonServlet(HttpServletResponse response){
		this.response = response;
	}
	
	@Override
	public void GsonUsuario(Usuario usuario) {
		try{
			Gson gson = new Gson();
			PrintWriter out = response.getWriter();
			out.write(gson.toJson(usuario)); 
			out.flush();
			out.close();
		}catch(Exception e){
			System.out.println("Erro GsonUsuario: "+e);
		}
	}

}
