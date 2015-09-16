package design.patterns.decorator;

import design.patterns.strategy.Orcamento;

/**
 *
 * @author paulo
 */
public class ISS extends Imposto {
    
	public ISS() {}
	
	public ISS(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
    @Override
    public double calcula(Orcamento orcamento) {
    	// ISS de 6% sobre o valor do Orçamento + o valor do próximo imposto. 
        return orcamento.getValor() * 0.06 + calculoDoProximoImposto(orcamento);
    }

    @Override
    public String getNome() {
        return "ISS".concat(getNomeProximoImposto());
    }

}
