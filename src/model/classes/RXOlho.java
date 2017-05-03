package model.classes;

public class RXOlho {

	private long id;
	private String olho;
	private double esferico;
	private double cilindrico;
	private double eixo;
	private double acuidadeVisual;
	
	public RXOlho(){
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOlho() {
		return olho;
	}
	public void setOlho(String olho) {
		this.olho = olho;
	}
	public double getEsferico() {
		return esferico;
	}
	public void setEsferico(double esferico) {
		this.esferico = esferico;
	}
	public double getCilindrico() {
		return cilindrico;
	}
	public void setCilindrico(double cilindrico) {
		this.cilindrico = cilindrico;
	}
	public double getEixo() {
		return eixo;
	}
	public void setEixo(double eixo) {
		this.eixo = eixo;
	}
	public double getAcuidadeVisual() {
		return acuidadeVisual;
	}
	public void setAcuidadeVisual(double acuidadeVisual) {
		this.acuidadeVisual = acuidadeVisual;
	}
	
}
