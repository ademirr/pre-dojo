package model;

import java.util.Calendar;

public class Acao {
	
	private Calendar dataHora;
	private String descAcao;
	private Jogador assassino;
	private Jogador morto;
	
	public Calendar getDataHora() {
		return dataHora;
	}
	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescAcao() {
		return descAcao;
	}
	public void setDescAcao(String descAcao) {
		this.descAcao = descAcao;
	}
	public Jogador getAssassino() {
		return assassino;
	}
	public void setAssassino(Jogador assassino) {
		this.assassino = assassino;
	}
	public Jogador getMorto() {
		return morto;
	}
	public void setMorto(Jogador morto) {
		this.morto = morto;
	}

}
