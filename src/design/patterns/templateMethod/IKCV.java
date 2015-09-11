package design.patterns.templateMethod;

import design.patterns.chainOfResponsibility.Item;
// import design.patterns.strategy.Imposto;
import design.patterns.strategy.Orcamento;

/**
 *
 * @author paulo
 */
// **** Como o template já implementa a interface Imposto, a classe ICPP apenas 
//      extenderá o template **** 
// public class ICPP implements Imposto {
public class IKCV extends TemplateDeImpostoCondicional {

    /* **** Podemos remover este método calcula() pois o mesmo já esta no template ****
    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento)) {
            return orcamento.getValor() * 0.10;
        } else {
            return orcamento.getValor() * 0.06;
        }
    }
    */

    @Override
    public String getNome() {
        return "IKCV";
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento));
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
    
    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) {
                return true;
            }
        }
        
        return false;
    }
    
}
