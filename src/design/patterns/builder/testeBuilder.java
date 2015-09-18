package design.patterns.builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author paulo
 */
public class testeBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* PROBLEMA: Criar um objeto NotaFiscal é complexo, requer muito trabalho.
            Para facilitar o ideal seria ter um classe que seu única responsabilidade
            seria criar as notas fiscais e facilitar a vida de quem precisa destas notas.
        
        // Arrays.asList(T... a) é uma API para a criação de uma lista, sendo que como parâmetro
        //  recebe T..., ou seja, muito itens do tipo "T". Em Java quando se tem os "..." no
        //  parâmetro significa que não há imite no número de parâmetros.
        List <ItemDaNota> itens = Arrays.asList(new ItemDaNota("Item 1", 200.0), new ItemDaNota("Item 2", 400.0));

        double valorBruto = 0;
        double valorImpostos = 0;
        for (ItemDaNota item : itens) {
            valorBruto += item.getValor();
            valorImpostos += item.getValor() * 0.05;
        }
        
        NotaFiscal nf = new NotaFiscal("Razão Social", "12.345.678/0001-12", Calendar.getInstance(), valorBruto, valorImpostos, itens, "Observação");
        */
        
        // A classe NotaFiscalBuilder é uma API pronta para a criação de notas fiscais com métodos elegantes
        //  e que esconderiam a complexidade da criação de notas fiscais.
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Razão Social");
        builder.comCnpj("12.345.678/0001-12");
        builder.comItem(new ItemDaNota("Item 1", 200.0));
        builder.comItem(new ItemDaNota("Item 2", 400.0));
        builder.comItem(new ItemDaNota("Item 3", 600.0));
        builder.comObservacoes("Observações");
        builder.comDataEmissao();
        
        NotaFiscal nf = builder.constroi();
        
        System.out.println("ValorBruto: " + nf.getValorBruto());
        System.out.println("ValorImpostos: " + nf.getValorImpostos());
        
        // Mas estamos utilizando muitas vezes a palavra builder. 
        // Podemos utilizar apenas o primeiro builder, mas para isso os metódos da 
        //  classe NotaFiscalBuilder precisa deixar de retornar void e retornar o próprio objeto.
        // Para exemplificar, criamos a classe NotaFiscalBuilderInterfacesFluentes.
        //
        // Para este estilo de programação damos o nome de "INTERFACES FLUENTES".
        // Métodos Chaining é o nome da técnica em que conseguimos invocar um método atráves de outro,
        //  eliminando o uso da variável (no exemplo, builder) várias vezes.
        NotaFiscalBuilderInterfacesFluentes builderInterfacesFluentes = new NotaFiscalBuilderInterfacesFluentes();
        builderInterfacesFluentes.paraEmpresa("Razão Social")
            .comCnpj("12.345.678/0001-12")
            .comItem(new ItemDaNota("Item 1", 200.0))
            .comItem(new ItemDaNota("Item 2", 400.0))
            .comItem(new ItemDaNota("Item 3", 600.0))
            .comObservacoes("Observações")
            .comDataEmissao();
        
        NotaFiscal nfInterfacesFluentes = builderInterfacesFluentes.constroi();
        System.out.println("\nInterfacesFluentes");
        System.out.println("ValorBruto: " + nfInterfacesFluentes.getValorBruto());
        System.out.println("ValorImpostos: " + nfInterfacesFluentes.getValorImpostos());
    }
    
}
