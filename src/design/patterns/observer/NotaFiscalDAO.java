package design.patterns.observer;

public class NotaFiscalDAO implements AcaoAposGerarNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Gravar no banco!");
	}

	/* Para diminuir o aclopamento na classe NotaFiscalBuilderInterfacesFluentes, a lógica 
	 * deste método será executado no método executa que deve ser implementado da interface.
	 * 
	public void gravarNoBanco(NotaFiscal nf) {
		System.out.println("Gravar no banco!");
	}
	 */
	
}
