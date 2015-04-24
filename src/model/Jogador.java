package model;

public class Jogador {
	
	private String nome;
	private Integer qtdAssassinatos=0;
	private Integer qtdMortes=0;
	
	public Jogador(){
		
	}
	
	public Jogador(String nome){
		this.nome=nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setQtdAssassinatos(Integer qtdAssassinatos) {
		this.qtdAssassinatos = qtdAssassinatos;
	}

	public Integer getQtdAssassinatos() {
		return qtdAssassinatos;
	}
	
	public boolean equals(Object o){
		if ((o instanceof Jogador) && (((Jogador)o).getNome().equals(this.getNome()))) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return 1;
	}

	public void setQtdMortes(Integer qtdMortes) {
		this.qtdMortes = qtdMortes;
	}

	public Integer getQtdMortes() {
		return qtdMortes;
	}

}
