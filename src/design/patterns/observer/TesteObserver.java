package design.patterns.observer;

public class TesteObserver {

	public static void main(String[] args) {
		NotaFiscalBuilderInterfacesFluentes builder = new NotaFiscalBuilderInterfacesFluentes();
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSMS());
		builder.adicionaAcao(new Impressora());
		
		NotaFiscal nf = builder.paraEmpresa("Razão Social")
							   .comCnpj("12.345.678/0001-12")
							   .comItem(new ItemDaNota("Caneta", 1.25))
							   .comObservacoes("Observações")
							   .comDataEmissao()
							   .constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
