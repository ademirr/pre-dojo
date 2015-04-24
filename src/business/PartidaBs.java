package business;

import java.util.Calendar;
import java.util.List;

import model.Acao;
import model.Jogador;
import model.Partida;

public class PartidaBs {
	
	private Partida partida = new Partida();
	
	public void setarInicio(String linhaInicio) {
		Calendar c = this.setarDataHora(linhaInicio.substring(0, 19));
		Acao inicio = new Acao();
		inicio.setDescAcao("Iniciar");
		inicio.setDataHora(c);
		partida.setAcaoInicio(inicio);
		String cdPartida = linhaInicio.substring(linhaInicio.indexOf("New match")+10, linhaInicio.indexOf("has started"));
		partida.setCdPartida(Long.valueOf(cdPartida.trim()));
	}
	
	public void setarCorpo(List<String> linhasCorpo) {
		for (String string : linhasCorpo) {
			Calendar c = this.setarDataHora(string.substring(0, 19));
			Acao corpo = new Acao();
			corpo.setDescAcao("Matar");
			corpo.setDataHora(c);
			String assassino = string.substring(22, string.indexOf("killed")).trim();
			if (!assassino.equals("<WORLD>")) {
				corpo.setAssassino(new Jogador(assassino));
			}
			String jogadorMorto = string.substring(string.indexOf("killed")+7).split(" ")[0];
			corpo.setMorto(new Jogador(jogadorMorto));
			partida.getAcoesCorpo().add(corpo);
		}
	}
	
	public void setarFim(String linhaFim) {
		Calendar c = this.setarDataHora(linhaFim.substring(0, 19));
		Acao fim = new Acao();
		fim.setDescAcao("Finalizar");
		fim.setDataHora(c);
		partida.setAcaoFim(fim);
	}
	
	public Calendar setarDataHora(String dataHora){
		String data = dataHora.substring(0, 10);
		String hora = dataHora.substring(11, 19);
		String[] datas = data.split("/");
		String[] horas = hora.split(":");
		Calendar c = Calendar.getInstance();
		c.set(Integer.valueOf(datas[2]), Integer.valueOf(datas[1])-1, Integer.valueOf(datas[0]), Integer.valueOf(horas[0]), Integer.valueOf(horas[1]), Integer.valueOf(horas[2]));
		return c;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public Partida getPartida() {
		return partida;
	}

}
