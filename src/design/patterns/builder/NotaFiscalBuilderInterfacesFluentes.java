package design.patterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author paulo
 */
class NotaFiscalBuilderInterfacesFluentes {
    
    private String razaoSocial;
    private String cnpj;
    // É final pois a lista já é inicializada, não sendo inicializada novamente.
    private final List<ItemDaNota> itens = new ArrayList<>();
    private double valorBruto = 0;
    private double valorImpostos = 0;
    private String observacoes;
    private Calendar dataEmissao;
    
    public NotaFiscalBuilderInterfacesFluentes paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        // Para poder ser utilizado o estilo de Interfaces Fluentes, necessitamos retornar o próprio objeto.
        return this;
    }
    
    public NotaFiscalBuilderInterfacesFluentes comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public NotaFiscalBuilderInterfacesFluentes comItem(ItemDaNota item) {
        this.itens.add(item);
        this.valorBruto += item.getValor();
        this.valorImpostos += item.getValor() * 0.05;
        return this;
    }
    
    public NotaFiscalBuilderInterfacesFluentes comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }
    
    public NotaFiscalBuilderInterfacesFluentes comDataEmissao() {
        this.dataEmissao = Calendar.getInstance();
        return this;
    }
    
    // Método que constroi a NotaFiscal com base nas informações que ele já possui.
    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, valorImpostos, itens, observacoes);
    }
    
}
