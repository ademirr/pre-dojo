package model;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	
	private String linhaInicio;
	private String linhaFim;
	private List<String> linhasCorpo = new ArrayList<String>();
	
	public String getLinhaInicio() {
		return linhaInicio;
	}
	public void setLinhaInicio(String linhaInicio) {
		this.linhaInicio = linhaInicio;
	}
	public String getLinhaFim() {
		return linhaFim;
	}
	public void setLinhaFim(String linhaFim) {
		this.linhaFim = linhaFim;
	}
	public List<String> getLinhasCorpo() {
		return linhasCorpo;
	}
	public void setLinhasCorpo(List<String> linhasCorpo) {
		this.linhasCorpo = linhasCorpo;
	}
	
	

}
