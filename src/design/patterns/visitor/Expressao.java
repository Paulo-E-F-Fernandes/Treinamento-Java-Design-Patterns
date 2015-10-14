package design.patterns.visitor;

public interface Expressao {

	int avalia();
	
	/* 
	 * No Visitor o nome deste método é "aceita", pois ele aceita um Visitor e 
	 *	invoca um método no Visitor que deve ser invocado naquele nó da árvore.
	 */
	void aceita(Visitor impressora);
	
}
