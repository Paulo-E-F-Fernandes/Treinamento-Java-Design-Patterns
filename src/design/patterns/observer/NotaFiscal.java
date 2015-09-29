package design.patterns.observer;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author paulo
 */
public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private Calendar dataDeEmissao;
    private double valorBruto;
    private double valorImpostos;
    private List<ItemDaNota> itens;
    private String observacoes;

    // ATALHOS: Para a geração do construtor com os fields como parâmetro. 
    //    Netbeans - Alt + Insert, seleciona Constructor e depois os fields.
    //    Eclipse  - Ctrl + 3, gcuf (generate construtor using fields)
    public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao, double valorBruto, double valorImpostos, List<ItemDaNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorBruto = valorBruto;
        this.valorImpostos = valorImpostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    // ATALHOS: Para a geração dos getters. 
    //    Netbeans - Alt + Insert, seleciona Getters e depois os fields.
    //    Eclipse  - Ctrl + 3, ggas (generate getters and setters)
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Calendar getDataDeEmissao() {
        return dataDeEmissao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getValorImpostos() {
        return valorImpostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }
    
    
    
}
