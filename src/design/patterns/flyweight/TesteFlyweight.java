package design.patterns.flyweight;

import java.util.Arrays;
import java.util.List;

public class TesteFlyweight {

	public static void main(String[] args) {
		/* PROBLEMA: Neste exemplo estamos instanciando três vezes a classe Fa(). A classe Fa() é a mesma
		 				e da maneira que estamos fazendo estamos gastando memória desnecessáriamente, pois
		 				a classe Fa() será a mesma. 
		 			 Em uma música maior com várias notas repetidas o consumo de memória será muito alto.
		
		List<Nota> musica = Arrays.asList(new Do(), new Re(), new Mi(), new Fa(), new Fa(), new Fa());  
		 */

		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
									notas.pega("do"), 
									notas.pega("re"),
									notas.pega("mi"), 
									notas.pega("fa"), 
									notas.pega("fa"),
									notas.pega("fa")
								);
		
		Piano piano = new Piano(); 
		piano.toca(musica);
	}
	
}
