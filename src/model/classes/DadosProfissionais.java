package model.classes;

public class DadosProfissionais {

	private long id;
	private String profissão;
	private String carteiraDeTrabalho;
	
	public DadosProfissionais(){	
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfissão() {
		return profissão;
	}
	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}
	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}
	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}
	
}
