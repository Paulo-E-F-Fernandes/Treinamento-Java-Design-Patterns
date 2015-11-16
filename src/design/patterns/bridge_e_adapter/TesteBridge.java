package design.patterns.bridge_e_adapter;

import java.io.InputStream;
import java.net.URL;

public class TesteBridge {

	public static void main(String[] args) throws Exception {
		// Algumas regras de negócio...
		
		// Em algum momento da aplicação é necessário pegar um mapa
		//	este mapa pode ser pego do GoogleMaps ou do MapLink ou ainda de outra API de terceiros
		
		/*
		--- O nosso objetivo é isolar a parte de obtenção do mapa em algum lugar do sistema,
		---		desta forma a obtenção do mapa será mais fácil. 
		// Pegando pelo Google Maps
		String googleMaps = "http://maps.google.com.br/maps?q=rua+cassiano";
		URL url = new URL(googleMaps);
		InputStream openStream = url.openStream();
		*/
		// A classe GoogleMaps esconde a complexidade de acessar a API do GoogleMaps
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua cassiano");
		
		// A classe MapLink esconde a complexidade de acessar a API do MapLink
		Mapa mapa2 = new MapLink();
		mapa.devolveMapa("rua cassiano");
		
		// usar a openStream aberta para fazer alguma coisa...
		
	}

}
