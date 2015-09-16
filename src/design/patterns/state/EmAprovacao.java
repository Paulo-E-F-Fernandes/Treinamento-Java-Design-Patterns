package design.patterns.state;

/*
 * Orçamentos "Em Aprovação" só podem ser aprovado e reprovados.
 */
public class EmAprovacao implements EstadosDeUmOrcamento {

	@Override
	public void aplicaDescontto(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05; // Desconto de 5% caso esteja nos estado EM_APROVACAO
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ser finalizados.");
	}
	
}
