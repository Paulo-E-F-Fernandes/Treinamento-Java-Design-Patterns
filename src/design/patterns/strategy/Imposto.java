package design.patterns.strategy;

/**
 *
 * @author paulo
 */
public interface Imposto {
    
    double calcula(Orcamento orcamento);
    
    String getNome(); 
    
}
