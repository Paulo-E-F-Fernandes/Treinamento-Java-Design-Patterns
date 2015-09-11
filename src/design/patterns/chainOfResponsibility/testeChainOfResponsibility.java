package design.patterns.chainOfResponsibility;

/**
 *
 * @author paulo
 */
public class testeChainOfResponsibility {
    
    /*
        O design patterns CHAIN OF RESPONSIBILITY é utilizado no caso de uma classe ser
        aplicada em um cenário específico e caso no caso de falha passa para a próxima classe.
    */
    public static void main(String[] args) {
        CalculadorDeDescontos descontos = new CalculadorDeDescontos();
        
        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new Item("Caneta", 250.0));
        orcamento.adicionaItem(new Item("Borracha", 250.0));
        
        double descontoFinal = descontos.calcula(orcamento);
        
        System.out.println(descontoFinal);
    }
    
}
