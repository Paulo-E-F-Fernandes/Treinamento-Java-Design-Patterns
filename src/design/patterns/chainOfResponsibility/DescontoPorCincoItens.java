package design.patterns.chainOfResponsibility;

/**
 *
 * @author paulo
 */
public class DescontoPorCincoItens implements Desconto {
    
    private Desconto proximo;
    
    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) { // primeira regra: mais de 5 itens, desconto!
            return orcamento.getValor() * 0.1;
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
