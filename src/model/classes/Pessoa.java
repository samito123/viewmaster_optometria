package model.classes;

import java.util.Date;

public class Pessoa {

	protected long pessoaId;
	protected String nome;
	protected String sexo;
	protected String telefone;
	protected String email;
	protected Date dataDeNascimento;
	protected DadosPessoais dadosPessoais;
	protected DadosProfissionais dadosProfissionais;
	protected Endereco endereco;
	
	public Pessoa() {
	}
	
	public long getPessoaId() {
		return pessoaId;
	}
	public void setPessoaId(long pessoaId) {
		this.pessoaId = pessoaId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	public DadosProfissionais getDadosProfissionais() {
		return dadosProfissionais;
	}
	public void setDadosProfissionais(DadosProfissionais dadosProfissionais) {
		this.dadosProfissionais = dadosProfissionais;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
