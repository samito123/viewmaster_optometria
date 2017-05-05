package control.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;

public class FabricaDeConexao {
	
	public Connection getConnection() throws ClassNotFoundException, ServletException {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					 "jdbc:mysql://localhost/vm_optometria", "sam", "123");
		}catch(SQLException e){
			throw new ServletException("Sem conexão com o banco de dados, "+e);
		}
		
	}
	
}
