package design.patterns.observer;

public class EnviadorDeSMS implements AcaoAposGerarNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviar SMS!");
	}

	/* Para diminuir o aclopamento na classe NotaFiscalBuilderInterfacesFluentes, a lógica 
	 * deste método será executado no método executa que deve ser implementado da interface.
	 * 
	public void enviarPorSMS(NotaFiscal nf) {
		System.out.println("Enviar SMS!");
	}
	 */
	
}
