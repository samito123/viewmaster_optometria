package model.classes;

import java.util.ArrayList;

public class Paciente extends Pessoa{

	private long id;
	private String dataDeCadastro;
	private ArrayList<Consulta> consultas;
	
	public Paciente(){
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(String dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}
	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	};
	
}
