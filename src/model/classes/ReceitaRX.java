package model.classes;

public class ReceitaRX {

	private long id;
	private String adicao;
	private String tipoDeLente;
	private String cor;
	private InformacoesReceitaRX informacoesReceitaRx;
	private RXOlho rxOlhoDireito;
	private RXOlho rxOlhoEsquerdo;
	
	public ReceitaRX(){
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdicao() {
		return adicao;
	}
	public void setAdicao(String adicao) {
		this.adicao = adicao;
	}
	public String getTipoDeLente() {
		return tipoDeLente;
	}
	public void setTipoDeLente(String tipoDeLente) {
		this.tipoDeLente = tipoDeLente;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public InformacoesReceitaRX getInformacoesReceitaRx() {
		return informacoesReceitaRx;
	}
	public void setInformacoesReceitaRx(InformacoesReceitaRX informacoesReceitaRx) {
		this.informacoesReceitaRx = informacoesReceitaRx;
	}
	public RXOlho getRxOlhoDireito() {
		return rxOlhoDireito;
	}
	public void setRxOlhoDireito(RXOlho rxOlhoDireito) {
		this.rxOlhoDireito = rxOlhoDireito;
	}
	public RXOlho getRxOlhoEsquerdo() {
		return rxOlhoEsquerdo;
	}
	public void setRxOlhoEsquerdo(RXOlho rxOlhoEsquerdo) {
		this.rxOlhoEsquerdo = rxOlhoEsquerdo;
	}
	
}
