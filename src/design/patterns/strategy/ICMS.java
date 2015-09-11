package design.patterns.strategy;

/**
 *
 * @author paulo
 */
public class ICMS implements Imposto {
    
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1; // ICMS de 10% sobre o valor do Orçamento
    }

    @Override
    public String getNome() {
        return "ICMS";
    }
    
}
