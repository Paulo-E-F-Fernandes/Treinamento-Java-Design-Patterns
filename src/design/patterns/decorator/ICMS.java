package design.patterns.decorator;

import design.patterns.strategy.Orcamento;

/**
 *
 * @author paulo
 */
public class ICMS extends Imposto {
	
	public ICMS() {}
	
	public ICMS(Imposto proximoImposto) {
		super(proximoImposto);
	}
    
    @Override
    public double calcula(Orcamento orcamento) {
    	// ICMS de 10% sobre o valor do Orçamento + o valor do próximo imposto.
        return orcamento.getValor() * 0.1 + calculoDoProximoImposto(orcamento); 
    }

	@Override
    public String getNome() {
        return "ICMS".concat(getNomeProximoImposto());
    }
    
}
