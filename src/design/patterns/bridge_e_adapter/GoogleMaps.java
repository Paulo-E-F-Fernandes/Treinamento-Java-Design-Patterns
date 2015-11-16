package design.patterns.bridge_e_adapter;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {
		try {
			String googleMaps = "http://maps.google.com.br/maps?q=" + rua;
			URL url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			// ler o openStream e realizar alguma lógica...
			return "mapa";
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}
