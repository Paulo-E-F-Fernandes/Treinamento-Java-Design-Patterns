package design.patterns.state;

/*
 * Orçamentos "Aprovados" só podem ser finalizados.
 */
public class Aprovado implements EstadosDeUmOrcamento {

	@Override
	public void aplicaDescontto(Orcamento orcamento) { 
		orcamento.valor -= orcamento.valor  * 0.02; // Desconto de 2% caso esteja nos estado APROVADO
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já aprovado.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
	
}
