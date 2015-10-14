package design.patterns.visitor;

/* 
 * O nome da classe foi alterado de "Impressora" para "ImpressoraVisitor" porque é uma classe
 * que visita a árvore e faz alguma coisa com ela. 
 */
public class ImpressoraVisitor implements Visitor {

	/* Será feita a impressão da soma no formato "(x + y)" */
	@Override
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		// A impressora chama o método visita da expressão da esquerda
		//	passando ela mesma como parâmetro
		soma.getEsquerda().aceita(this);
		System.out.print(" + ");
		// A impressora chama o método visita da expressão da direita
		//	passando ela mesma como parâmetro
		soma.getDireita().aceita(this);
		System.out.print(")");
	}
	
	/* Será feita a impressão da subtração no formato "(x - y)" */
	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print("(");
		// A impressora chama o método visita da expressão da esquerda
		//	passando ela mesma como parâmetro
		subtracao.getEsquerda().aceita(this);
		System.out.print(" - ");
		// A impressora chama o método visita da expressão da esquerda
		//	passando ela mesma como parâmetro
		subtracao.getDireita().aceita(this);
		System.out.print(")");
	}
	
	@Override
	public void visitaNumero(Numero numero) {
		// O número imprime ele mesmo
		System.out.print(numero.getNumero());
	}
	
}
