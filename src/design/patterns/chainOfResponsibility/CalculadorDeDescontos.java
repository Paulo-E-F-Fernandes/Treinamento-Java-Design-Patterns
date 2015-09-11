package design.patterns.chainOfResponsibility;

import design.patterns.strategy.Orcamento;

/**
 *
 * @author paulo
 */
public class CalculadorDeDescontos {

    // Caso o orçamento possua mais de 5 itens, dar desconto, caso contrário,
    //  verifica se o orçamento tem um valor maior que 500, se sim, dar desconto, 
    //  caso contráro, não possui desconto.
    // OBS.: Descontos não cumulativos.
    public double calcula(Orcamento orcamento) {
        /*
        // PROBLEMA: A cada desconto novo é necessário colocar um novo if, sendo que a classe
        //  ficará gigante. Vamos separar as responsabilidade em classes, cada classe para um tipo de desconto.
        if (orcamento.getItens().size() > 5) { // primeira regra: mais de 5 itens, desconto!
            return orcamento.getValor() * 0.1;
        } else if (orcamento.getValor() > 500.0) { // segunda regra: valor do orçamento maior que 500, desconto!
            return orcamento.getValor() * 0.07;
        }
        */
        
        /*
        // PROBLEMA: Mesmo assim a classe sempre continuará crescendo, sendo necessário adicionar
        //  novos ifs a cada novo desconto.
        // O ideal seria que cada desconto ao falhar saiba qual o próximo desconto chamar
        double desconto = new DescontoPorCincoItens().desconta(orcamento);
        // Caso o orçamento não tenha cinco itens
        if (desconto == 0) {desconto = new DescontoPorMaisDeQuinhentosReais().desconta(orcamento);}
        // Caso o orçamento não possua valor maior que 500, chamar o próximo desconto
//        if (desconto == 0) {desconto = new ProximoDesconto...}
        
        // caso contrário.
        return 0;
        */
        
        // Agora o cliente, neste caso o CalculadorDeDesconto, é responsável por apenas montar a cadeia de descontos.
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new SemDesconto();
        
        // Dizer que o desconto d2 deve ocorrer caso o desconto d1 falhar.
        d1.setProximo(d2);
        d2.setProximo(d3);
        
        // Agora basta retornar os descontos a partir do d1.
        // Se o d1 falhar, vai ser chamado o d2 e assim por diante.
        return d1.desconta(orcamento);
    }
    
}
