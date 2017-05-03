package model.classes;

public class Consulta {

	private long id;
	private String dataDaConsulta;
	private Locacao locacao;
	private Funcionario funcionario;
	private Anamnese anamnese;
	private ReceitaRX receitaRX;
	
	public Consulta(){
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDataDaConsulta() {
		return dataDaConsulta;
	}
	public void setDataDaConsulta(String dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Anamnese getAnamnese() {
		return anamnese;
	}
	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}
	public ReceitaRX getReceitaRX() {
		return receitaRX;
	}
	public void setReceitaRX(ReceitaRX receitaRX) {
		this.receitaRX = receitaRX;
	}
	
}
