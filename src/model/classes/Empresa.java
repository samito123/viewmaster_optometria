package model.classes;

import java.util.ArrayList;

public class Empresa {

	private long id;
	private String empresa;
	private String cadastroNacionalDePessoaJuridica;
	private ArrayList<Locacao> locacoes;
	private ArrayList<Funcionario> funcionarios;
	
	public Empresa(){
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCadastroNacionalDePessoaJuridica() {
		return cadastroNacionalDePessoaJuridica;
	}
	public void setCadastroNacionalDePessoaJuridica(
			String cadastroNacionalDePessoaJuridica) {
		this.cadastroNacionalDePessoaJuridica = cadastroNacionalDePessoaJuridica;
	}
	public ArrayList<Locacao> getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(ArrayList<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
