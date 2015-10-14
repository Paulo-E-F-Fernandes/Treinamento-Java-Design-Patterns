package design.patterns.visitor;

public interface Visitor {

	/* Será feita a impressão da soma no formato "(x + y)" */
	public abstract void visitaSoma(Soma soma);

	/* Será feita a impressão da subtração no formato "(x - y)" */
	public abstract void visitaSubtracao(Subtracao subtracao);

	public abstract void visitaNumero(Numero numero);

}