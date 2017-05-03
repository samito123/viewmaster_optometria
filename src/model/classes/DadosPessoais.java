package model.classes;

public class DadosPessoais {

	private long id;
	private String registroGeral;
	private String cadastroDePessoaFisica;
	
	public DadosPessoais(){
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getCadastroDePessoaFisica() {
		return cadastroDePessoaFisica;
	}
	public void setCadastroDePessoaFisica(String cadastroDePessoaFisica) {
		this.cadastroDePessoaFisica = cadastroDePessoaFisica;
	}
	
}
