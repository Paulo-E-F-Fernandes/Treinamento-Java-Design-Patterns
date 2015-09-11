package design.patterns.strategy;

/**
 *
 * @author paulo
 */
public class ISS implements Imposto {
    
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06; // ISS de 6% sobre o valor do Orçamento
    }

    @Override
    public String getNome() {
        return "ISS";
    }
    
}
