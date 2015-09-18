package design.patterns.builder;

/**
 *
 * @author paulo
 */
class ItemDaNota {

    // Estes atributos podem ser finais pois somente o construtor atribui valor a eles.
    private final String nome;
    private final double valor;

    // ATALHOS: Para a geração do construtor com os fields como parâmetro. 
    //    Netbeans - Alt + Insert, seleciona Constructor e depois os fields.
    //    Eclipse  - Ctrl + 3, gcuf (generate construtor using fields)
    public ItemDaNota(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // ATALHOS: Para a geração dos getters. 
    //    Netbeans - Alt + Insert, seleciona Getters e depois os fields.
    //    Eclipse  - Ctrl + 3, ggas (generate getters and setters)
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    
    
}
