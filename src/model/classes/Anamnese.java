package model.classes;

public class Anamnese {

	private long id;
	private String motivoDaConsulta;
	private String sinaisSintomas;
	private String antecedentesPessoaisOuFamiliares;
	
	public Anamnese(){
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMotivoDaConsulta() {
		return motivoDaConsulta;
	}
	public void setMotivoDaConsulta(String motivoDaConsulta) {
		this.motivoDaConsulta = motivoDaConsulta;
	}
	public String getSinaisSintomas() {
		return sinaisSintomas;
	}
	public void setSinaisSintomas(String sinaisSintomas) {
		this.sinaisSintomas = sinaisSintomas;
	}
	public String getAntecedentesPessoaisOuFamiliares() {
		return antecedentesPessoaisOuFamiliares;
	}
	public void setAntecedentesPessoaisOuFamiliares(
			String antecedentesPessoaisOuFamiliares) {
		this.antecedentesPessoaisOuFamiliares = antecedentesPessoaisOuFamiliares;
	}
	
}
