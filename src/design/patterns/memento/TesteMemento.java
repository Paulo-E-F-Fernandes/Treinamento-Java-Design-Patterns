package design.patterns.memento;

import java.util.Calendar;

public class TesteMemento {

	public static void main(String[] args) {
		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "Cliente Fulano", TipoContrato.NOVO);
		
		// Adiciona o primeiro estado do contrato c1
		historico.adiciona(c1.salvaEstado());
		// Pega estado atual
		Estado estado = historico.pegaAtual();
		// Imprimi informações do estado
		System.out.println(estado.getEstado().getCliente() + " - " + estado.getEstado().getTipo());
		
		// Avança para o próximo estado.
		c1.avanca();
		// Adiciona o primeiro estado do contrato c1
		historico.adiciona(c1.salvaEstado());
		// Pega estado atual
		estado = historico.pegaAtual();
		// Imprimi informações do estado
		System.out.println(estado.getEstado().getCliente() + " - " + estado.getEstado().getTipo());
		
		// Avança para o próximo estado.
		c1.avanca();
		// Adiciona o primeiro estado do contrato c1
		historico.adiciona(c1.salvaEstado());
		// Pega estado atual
		estado = historico.pegaAtual();
		// Imprimi informações do estado
		System.out.println(estado.getEstado().getCliente() + " - " + estado.getEstado().getTipo());
		
		// Pega estado anterior
		estado = historico.pega(1);
		// Imprimi informações do estado
		System.out.println(estado.getEstado().getCliente() + " - " + estado.getEstado().getTipo());
		
		// Pega o primeiro estado
		estado = historico.pega(0);
		// Imprimi informações do estado
		System.out.println(estado.getEstado().getCliente() + " - " + estado.getEstado().getTipo());
	}

}
