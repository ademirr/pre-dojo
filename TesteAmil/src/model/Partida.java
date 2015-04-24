package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Partida {
	
	private Long cdPartida;
	private Acao acaoInicio;
	private Acao acaoFim;
	private List<Acao> acoesCorpo = new ArrayList<Acao>();
	private List<Jogador> assassinos = new ArrayList<Jogador>();
	private List<Jogador> mortos = new ArrayList<Jogador>();
	
	public Long getCdPartida() {
		return cdPartida;
	}
	public void setCdPartida(Long cdPartida) {
		this.cdPartida = cdPartida;
	}
	public Acao getAcaoInicio() {
		return acaoInicio;
	}
	public void setAcaoInicio(Acao acaoInicio) {
		this.acaoInicio = acaoInicio;
	}
	public Acao getAcaoFim() {
		return acaoFim;
	}
	public void setAcaoFim(Acao acaoFim) {
		this.acaoFim = acaoFim;
	}
	public List<Acao> getAcoesCorpo() {
		return acoesCorpo;
	}
	public void setAcoesCorpo(List<Acao> acoesCorpo) {
		this.acoesCorpo = acoesCorpo;
	}
	public List<Jogador> getAssassinos() {
		return assassinos;
	}
	public void setAssassinos(List<Jogador> assassinos) {
		this.assassinos = assassinos;
	}
	public List<Jogador> getMortos() {
		return mortos;
	}
	public void setMortos(List<Jogador> mortos) {
		this.mortos = mortos;
	}
	
	public Collection<Jogador> ordenaAssassinos(Collection<Jogador> jogadores){
		Collections.sort((List<Jogador>) jogadores, new Comparator<Jogador>() {
			public int compare(Jogador j1, Jogador j2) {
				Integer i = j2.getQtdAssassinatos()-j1.getQtdAssassinatos();
				return i.intValue();
			}
		});
		return jogadores;
	}
	
	public Collection<Jogador> ordenaMortos(Collection<Jogador> jogadores){
		Collections.sort((List<Jogador>) jogadores, new Comparator<Jogador>() {
			public int compare(Jogador j1, Jogador j2) {
				Integer i = j2.getQtdMortes()-j1.getQtdMortes();
				return i.intValue();
			}
		});
		return jogadores;
	}

}
