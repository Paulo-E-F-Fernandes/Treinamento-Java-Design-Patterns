package design.patterns.visitor;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void aceita(Visitor impressora) {
		/* A impressora vai visitar o número do próprio objeto que está chamando o método da impressora */
		impressora.visitaNumero(this);
	}
	
}
