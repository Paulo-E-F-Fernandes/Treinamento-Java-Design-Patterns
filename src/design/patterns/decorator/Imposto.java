package design.patterns.decorator;

import design.patterns.strategy.Orcamento;

/**
 *
 * @author paulo
 */
public abstract class Imposto {
	
	protected Imposto proximoImposto;

	/*
	 * Construtor para impostos simples, ou seja, o imposto não possui um próximo imposto
	 */
	public Imposto() {};
    
    /*
	 * Construtor para impostos complexos, que possuem um próximo imposto.
	 */
	public Imposto(Imposto proximoImposto) {
		this.proximoImposto = proximoImposto;
	}
	
	public abstract double calcula(Orcamento orcamento);
    
    public abstract String getNome();
    
    protected double calculoDoProximoImposto(Orcamento orcamento) {
		if (proximoImposto == null) { // Caso o imposto não possua um próximo imposto, retorna zero.
			return 0;
		} else { // Retorna o cálculo do próximo imposto.
			return proximoImposto.calcula(orcamento);
		}
	}
    
    protected String getNomeProximoImposto() {
    	if (proximoImposto == null) {
    		return "";
    	} else {
    		return "/".concat(proximoImposto.getNome());
    	}
	}
    
}
