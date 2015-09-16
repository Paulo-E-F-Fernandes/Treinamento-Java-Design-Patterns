package design.patterns.state;

/*
 * Orçamentos "Reprovados" só podem ser finalizados.
 */
public class Reprovado implements EstadosDeUmOrcamento {

	@Override
	public void aplicaDescontto(Orcamento orcamento) {
		throw new RuntimeException("Somente orçamentos em aprovação ou aprovados ganham descontos.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
