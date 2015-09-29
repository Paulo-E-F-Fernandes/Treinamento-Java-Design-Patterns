package design.patterns.flyweight;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {
	
	public void toca(List<Nota> musica) {
		// http://www.jfugue.org/ - jar para tocar músicas em Java
		// Com o jfugue-5.0.4.jar na pasta lib, ou qualquer outra, clique com o direito do mouse sobre o jar,
		//	Build Path -> Add to Build Path
		Player player = new Player();
		
		// Como para tocar no jfugue é necessário que a string estaja no formato "F B C A F F"
		StringBuilder musicaEmNotas = new StringBuilder();
		for (Nota nota : musica) {
			musicaEmNotas.append(nota.simbolo() + " ");
		}
		
		System.out.println(musicaEmNotas.toString());
		
		player.play(musicaEmNotas.toString());
	}
	
}
