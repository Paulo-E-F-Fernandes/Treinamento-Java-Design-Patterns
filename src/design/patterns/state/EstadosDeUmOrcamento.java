package design.patterns.state;

public interface EstadosDeUmOrcamento {
	
	void aplicaDescontto(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	
	void reprova(Orcamento orcamento);
	
	void finaliza(Orcamento orcamento);
}
