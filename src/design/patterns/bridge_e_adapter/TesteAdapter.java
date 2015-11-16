package design.patterns.bridge_e_adapter;

import java.util.Calendar;

public class TesteAdapter {

	public static void main(String[] args) {
		// Como podemos pegar a hora atual com Java? Com Calendar.getInstance(), por exemplo.
		// 
		// A API de Calendar retorna a data atual do sistema em Java, mas é uma API legada
		//	que utiliza de métodos estáticos para retornar os valores relativos às horas e 
		//	para não espalharmos estes métodos estáticos em todo o nosso sistema, algo que
		//	dificulta a testabilidade do sistema pois, métodos estáticos são complicados de 
		//	testar.
		//
		// Então a idéia é esconder este métodos estáticos. O design patterns ADAPTER tem como 
		//	objetivo esconder a complexidade de utilizar uma API legada, com código legado.
		
		Relogio relogio = new RelogioComCalendar();
		Calendar dataAtual = relogio.dataAtual();
	}

}
