package design.patterns.chainOfResponsibility;

import design.patterns.strategy.Orcamento;

/**
 * Classe terminal que sinaliza que não existe mais descontos para ser aplicado.
 * 
 * @author paulo
 */
public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        // não possui próximo!
    }
    
}
