package design.patterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author paulo
 */
class NotaFiscalBuilder {
    
    private String razaoSocial;
    private String cnpj;
    // É final pois a lista já é inicializada, não sendo inicializada novamente.
    private final List<ItemDaNota> itens = new ArrayList<>();
    private double valorBruto = 0;
    private double valorImpostos = 0;
    private String observacoes;
    private Calendar dataEmissao;
    
    public void paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public void comCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void comItem(ItemDaNota item) {
        this.itens.add(item);
        this.valorBruto += item.getValor();
        this.valorImpostos += item.getValor() * 0.05;
    }
    
    public void comObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public void comDataEmissao() {
        this.dataEmissao = Calendar.getInstance();
    }
    
    // Método que constroi a NotaFiscal com base nas informações que ele já possui.
    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, valorImpostos, itens, observacoes);
    }
    
}
