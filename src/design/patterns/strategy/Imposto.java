package design.patterns.strategy;

/**
 *
 * @author paulo
 */
interface Imposto {
    
    double calcula(Orcamento orcamento);
    
    String getNome(); 
    
}
