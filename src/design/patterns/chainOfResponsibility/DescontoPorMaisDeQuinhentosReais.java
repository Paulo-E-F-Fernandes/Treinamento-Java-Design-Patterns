package design.patterns.chainOfResponsibility;

/**
 *
 * @author paulo
 */
public class DescontoPorMaisDeQuinhentosReais implements Desconto {
    
    private Desconto proximo;
    
    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500.0) { // segunda regra: valor do orçamento maior que 500, desconto!
            return orcamento.getValor() * 0.07;
        } else {
            // Em vez de retorna zero, retorna o próximo desconto.
            //return 0;
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
    
}
