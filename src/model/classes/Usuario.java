package model.classes;

import model.dao.UsuarioDAO;
import model.interfaces.GsonServletInterface;

public class Usuario extends Pessoa{
	
	private long usuarioId;
	private String login;
	private String senha;
	
	public Usuario(){
	}
		
	public long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
