package design.patterns.observer;

public class Impressora implements AcaoAposGerarNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Imprimir Nota Fiscal!");
	}

	/* Para diminuir o aclopamento na classe NotaFiscalBuilderInterfacesFluentes, a lógica 
	 * deste método será executado no método executa que deve ser implementado da interface.
	 * 
	public void imprime(NotaFiscal nf) {
		System.out.println("Imprimir Nota Fiscal!");
	}
	 */
	
}
