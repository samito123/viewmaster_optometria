package model.classes;

import model.interfaces.UsuarioInterface;

public class Usuario extends Funcionario implements UsuarioInterface{
	
	private long id;
	private String login;
	private String senha;
	
	public Usuario(){
	}
	
	@Override
	public boolean ValidaLogin() {
		if(this.login.equals("Sam") && this.senha.equals("123"))
			return true;
		else
			return false;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
