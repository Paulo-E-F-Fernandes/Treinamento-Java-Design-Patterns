package design.patterns.memento;

/* 
 * Estado que objeto está em determinado momento 
 * 
 * Esta classe apenas encapsula o contrato para facilitar a nossa vida.
 */
public class Estado {

	private Contrato contrato;

	public Estado(Contrato contrato) {
		this.contrato = contrato;
	}
	
	public Contrato getEstado() {
		return contrato;
	}
	
}
