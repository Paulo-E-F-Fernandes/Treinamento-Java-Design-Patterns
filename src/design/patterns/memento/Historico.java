package design.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	private List<Estado> estadosSalvos = new ArrayList<Estado>();
	
	public void adiciona(Estado estado) {
		estadosSalvos.add(estado);
	}
	
	public Estado pega(int index) {
		return estadosSalvos.get(index);
	}

	/* Método para pegar o estado atual do contrato - Criado por mim, não apresentado no curso */
	public Estado pegaAtual() {
		return estadosSalvos.get(estadosSalvos.size() - 1);
	}
	
}
