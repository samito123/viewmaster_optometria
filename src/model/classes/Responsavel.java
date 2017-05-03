package model.classes;

public class Responsavel extends Pessoa{

	private long id;
	private String grauDeParentesco;
	
	public Responsavel(){
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGrauDeParentesco() {
		return grauDeParentesco;
	}
	public void setGrauDeParentesco(String grauDeParentesco) {
		this.grauDeParentesco = grauDeParentesco;
	}
	
}
