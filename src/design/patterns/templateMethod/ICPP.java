package design.patterns.templateMethod;

// import design.patterns.strategy.Imposto;
import design.patterns.strategy.Orcamento;

/**
 *
 * @author paulo
 */
// **** Como o template já implementa a interface Imposto, a classe ICPP apenas 
//      extenderá o template **** 
// public class ICPP implements Imposto {
public class ICPP extends TemplateDeImpostoCondicional {

    /* **** Podemos remover este método calcula() pois o mesmo já esta no template ****
    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        } else {
            return orcamento.getValor() * 0.05;
        }
    }
    */

    @Override
    public String getNome() {
        return "ICCP";
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() > 500);
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
    
}
