package design.patterns.decorator;

import design.patterns.strategy.Orcamento;

public class IKPV extends Imposto {

	public IKPV() {}
	
	public IKPV(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		// ISS de 15% sobre o valor do Orçamento + o valor do próximo imposto.
		return orcamento.getValor() * 0.15 + calculoDoProximoImposto(orcamento);
	}

	@Override
	public String getNome() {
		return "IKPV".concat(getNomeProximoImposto());
	}

}
