package design.patterns.chainOfResponsibility;

/**
 *
 * @author paulo
 */
public interface Desconto {

    double desconta(Orcamento orcamento);
    
    void setProximo(Desconto proximo);
    
}
