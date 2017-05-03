package model.classes;

public class InformacoesReceitaRX {

	private long id;
	private String utilizaRX;
	private String tipoDeRX;
	private int ultimoControle;
	private String ultimoControleMesOuAno;
	private int ultimaRX;
	private String ultimaRXMesOuAno;
	
	public InformacoesReceitaRX(){
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUtilizaRX() {
		return utilizaRX;
	}
	public void setUtilizaRX(String utilizaRX) {
		this.utilizaRX = utilizaRX;
	}
	public String getTipoDeRX() {
		return tipoDeRX;
	}
	public void setTipoDeRX(String tipoDeRX) {
		this.tipoDeRX = tipoDeRX;
	}
	public int getUltimoControle() {
		return ultimoControle;
	}
	public void setUltimoControle(int ultimoControle) {
		this.ultimoControle = ultimoControle;
	}
	public String getUltimoControleMesOuAno() {
		return ultimoControleMesOuAno;
	}
	public void setUltimoControleMesOuAno(String ultimoControleMesOuAno) {
		this.ultimoControleMesOuAno = ultimoControleMesOuAno;
	}
	public int getUltimaRX() {
		return ultimaRX;
	}
	public void setUltimaRX(int ultimaRX) {
		this.ultimaRX = ultimaRX;
	}
	public String getUltimaRXMesOuAno() {
		return ultimaRXMesOuAno;
	}
	public void setUltimaRXMesOuAno(String ultimaRXMesOuAno) {
		this.ultimaRXMesOuAno = ultimaRXMesOuAno;
	}
	
}
