package design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	
	// Construtor estático da classe.
	// O construtor estático é executa quando a JVM carrega esta classe. 
	// Este construtor estático é executado apenas uma vez.
	static {
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
	}
	
	// Este método retorna a nota de nome igual a do parâmetro passado.
	// Todas as notas já estão carregadas no MAP notas, elas foram instânciadas uma vez
	//	pelo construtor estático e podem ser utilizadas a qualquer momento pela chamada
	//	do método pega desta classe.
	public Nota pega(String nome) {
		return notas.get(nome);
	}
}
