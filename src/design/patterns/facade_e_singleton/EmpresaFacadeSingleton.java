package design.patterns.facade_e_singleton;

public class EmpresaFacadeSingleton {

	// O Singleton sempre possuirá uma instância estática do objeto.
	private static EmpresaFacade instancia;
	
	public EmpresaFacade getInstancia() {
		// Este método do Singleton sempre instanciará o objeto caso o mesmo não foi feito ainda. 
		if (instancia == null) {
			instancia = new EmpresaFacade();
		}
		return instancia;
	}
}
