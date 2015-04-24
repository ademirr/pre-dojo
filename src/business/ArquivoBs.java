package business;

import java.util.Hashtable;
import java.util.List;

import model.Arquivo;

public class ArquivoBs {
	
	private Arquivo arquivo;
	
	public void setarLinhas(List<String> linhas){
		Arquivo arquivo = new Arquivo();
		arquivo.setLinhaInicio(linhas.get(0));
		arquivo.setLinhaFim(linhas.get(linhas.size()-1));
		linhas.remove(0);
		linhas.remove(linhas.size()-1);
		arquivo.setLinhasCorpo(linhas);
		this.setArquivo(arquivo);
	}
	
	public void xxx(List<String> linhas){
		Hashtable<String, Integer> tabelaOrigem = new Hashtable<String, Integer>();
		for (String string : linhas) {
			if (tabelaOrigem.containsKey(string.substring(22, 27))) {
				tabelaOrigem.put(string.substring(22, 27), tabelaOrigem.get(string.substring(22, 27))+1);
			} else {
				tabelaOrigem.put(string.substring(22, 27), 1);
			}
		}
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

}
