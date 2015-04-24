package action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Jogador;
import business.ArquivoBs;
import business.PartidaBs;
import business.RankingBs;

public class LerLog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("log_03.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			List<String> linhas = new ArrayList<String>();
			while ((s=br.readLine()) !=null) {
				linhas.add(s);
			}
			ArquivoBs arquivoBs = new ArquivoBs();
			arquivoBs.setarLinhas(linhas);
			PartidaBs partidaBs = new PartidaBs();
			partidaBs.setarInicio(arquivoBs.getArquivo().getLinhaInicio());
			partidaBs.setarCorpo(arquivoBs.getArquivo().getLinhasCorpo());
			partidaBs.setarFim(arquivoBs.getArquivo().getLinhaFim());
			RankingBs ranking = new RankingBs();
			ranking.obtendoJogadoresAssassinosEMortos(partidaBs.getPartida());
			System.out.println("Assassinos: ");
			for (Jogador jog : partidaBs.getPartida().ordenaAssassinos(partidaBs.getPartida().getAssassinos())) {
				System.out.println(jog.getNome() + ": " + jog.getQtdAssassinatos());
			}
			System.out.println();
			System.out.println("Mortos: ");
			for (Jogador jog : partidaBs.getPartida().ordenaMortos(partidaBs.getPartida().getMortos())) {
				System.out.println(jog.getNome() + ": " + jog.getQtdMortes());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
