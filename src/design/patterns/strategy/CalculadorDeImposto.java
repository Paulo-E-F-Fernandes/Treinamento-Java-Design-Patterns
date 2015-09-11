package design.patterns.strategy;

/**
 *
 * @author paulo
 */
public class CalculadorDeImposto {

    /* 
    **** 
    PARA RESOLVER O PROBLEMA DO CRESCIMENTO DO MÉTODO, VAMOS FAZER COM QUE O MÉTODO realizaCalculo
    RECEBA UM IMPOSTO QUALQUER E REALIZE O CÁLCULO DO MESMO DE MANEIRA GENÉRICO, E NÃO DE UM IMPOSTO ESPECÍFICO. 
    PARA ISSO VAMO CRIAR UMA INTERFACE PARA OS IMPOSTOS E COLOCAR COMO PARÂMETRO DO MÉTODO realizaCalculo.
    ****
    public void realizaCalculo(Orcamento orcamento, String imposto) {
        
        // **** PROBLEMA: Para cada imposto criado, será necessário criar um novo if aqui.          **** 
        // ****           Vamos quebrar as responsabilidades e colocar cada imposto em sua classe.  **** 
//        if (imposto.equals("ICMS")) {
//            double icms = orcamento.getValor() * 0.1; // ICMS de 10% sobre o valor do Orçamento
//            System.out.println(icms);
//        } else if (imposto.equals("ISS")) {
//            double iss = orcamento.getValor() * 0.06; // ISS de 6% sobre o valor do Orçamento
//            System.out.println(iss);
//        }
        
        // **** PROBLEMA: Continuamos com o mesmo problema, este método crescerá para sempre.
        //                A cada novo imposto será necessário um novo if.
//        if (imposto.equals("ICMS")) {
//            double icms = new ICMS().calculaICMS(orcamento);
//            System.out.println(icms);
//        } else if (imposto.equals("ISS")) {
//            double iss = new ISS().calculaISS(orcamento);
//            System.out.println(iss);
//        }
    }
    */
    
    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        System.out.println(imposto.getNome() + ": " + imposto.calcula(orcamento));
    }
}
