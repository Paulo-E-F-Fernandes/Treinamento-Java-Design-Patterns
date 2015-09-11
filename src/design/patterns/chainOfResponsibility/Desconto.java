package design.patterns.chainOfResponsibility;

import design.patterns.strategy.Orcamento;

/**
 *
 * @author paulo
 */
public interface Desconto {

    double desconta(Orcamento orcamento);
    
    void setProximo(Desconto proximo);
    
}
