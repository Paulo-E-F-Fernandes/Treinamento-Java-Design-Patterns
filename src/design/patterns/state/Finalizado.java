package design.patterns.state;

/*
 * Orçamentos "Finalizados" não podem ser aprovados, reprovados e nem finalizados.
 */
public class Finalizado implements EstadosDeUmOrcamento {

	@Override
	public void aplicaDescontto(Orcamento orcamento) {
		throw new RuntimeException("Somente orçamentos em aprovação ou aprovados ganham descontos.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não podem ser aprovados.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não podem ser reprovados.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado.");
	}

}
