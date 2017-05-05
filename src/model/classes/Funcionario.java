package model.classes;

public class Funcionario extends Usuario{

	private long funcionarioId;
	private String ocupacao;
	private Locacao locacao;
	
	public Funcionario(){
	}
	public long getFuncionarioId() {
		return funcionarioId;
	}
	public void setFuncionarioId(long funcionarioId) {
		this.funcionarioId = funcionarioId;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	
}
