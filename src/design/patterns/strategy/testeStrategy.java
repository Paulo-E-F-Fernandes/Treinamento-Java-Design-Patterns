package design.patterns.strategy;

/**
 *
 * @author paulo
 */
public class testeStrategy {

    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();
        
        Orcamento orcamento = new Orcamento(1000.0);
        
        CalculadorDeImposto calculador = new CalculadorDeImposto();
        
        /* 
            O cliente, no caso está classe main, passa para o CalculadorDeImposto uma estratégia de cálculo,
            enquanto que a classe CalculadorDeImposto recebe está estratégia e utiliza a mesma para calcular o imposto.
            
            Esse design pattern é chamado de Strategy, sendo que desta forma evitamos todos os if's que estavam sendo feitos
            na classe CalculadorDeImposto e para cada novo imposto criado o calculador funcionará.
        */
        calculador.realizaCalculo(orcamento, icms);
        calculador.realizaCalculo(orcamento, iss);
    }
    
}
