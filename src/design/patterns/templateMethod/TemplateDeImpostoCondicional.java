package design.patterns.templateMethod;

import design.patterns.strategy.Imposto;
import design.patterns.strategy.Orcamento;

/**
 * O design patterns TEMPLATE METHOD é utilizado quando temos classes que implementam métodos
 *  que utilizam lógicas semelhantes. 
 * 
 * Então o template terá a implentação do método que será utilizado como molde, e dentro deste
 *  molde terá as validações e valores implementados por que herdar o template, com isso essas
 *  validações e valores seram abstratos.
 * 
 * As classe que herdam do template precisam implementar apenas os "buracos" deixados pelo template,
 *  pois essa já possui a lógica.
 * 
 * @author paulo
 */
public abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    @Override
    public abstract String getNome();

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract double minimaTaxacao(Orcamento orcamento);
    
}
