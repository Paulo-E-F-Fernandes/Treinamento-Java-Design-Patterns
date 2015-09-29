package design.patterns.observer;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviar e-mail!");
	}
	
	/* Para diminuir o aclopamento na classe NotaFiscalBuilderInterfacesFluentes, a lógica 
	 * deste método será executado no método executa que deve ser implementado da interface.
	 * 
	public void enviarPorEmail(NotaFiscal nf) {
		System.out.println("Enviar e-mail!");
	}
	 */
	
}
