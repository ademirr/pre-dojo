package business;

import model.Acao;
import model.Jogador;
import model.Partida;

public class RankingBs {
	
	public void obtendoJogadoresAssassinosEMortos(Partida partida){
		for (Acao acao : partida.getAcoesCorpo()) {
			if (acao.getAssassino()!=null) {
				if (partida.getAssassinos().contains(acao.getAssassino())) {
					Jogador assassinoLista = partida.getAssassinos().get(partida.getAssassinos().indexOf(acao.getAssassino()));
					assassinoLista.setQtdAssassinatos(assassinoLista.getQtdAssassinatos()+1);
				} else {
					acao.getAssassino().setQtdAssassinatos(1);
					partida.getAssassinos().add(acao.getAssassino());
				}
			}
			if (partida.getMortos().contains(acao.getMorto())) {
				Jogador mortoLista = partida.getMortos().get(partida.getMortos().indexOf(acao.getMorto()));
				mortoLista.setQtdMortes(mortoLista.getQtdMortes()+1);
			} else {
				acao.getMorto().setQtdMortes(1);
				partida.getMortos().add(acao.getMorto());
			}
		}
	}

}
