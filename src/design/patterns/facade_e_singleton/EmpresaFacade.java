package design.patterns.facade_e_singleton;

public class EmpresaFacade {

	// É comum que o construtor da classe seja protected para que apenas classes do mesmo 
	//	pacote possam criar.
	protected EmpresaFacade() {}
	
	public Cliente buscaCliente(String cpf) {
		return new ClienteDAO().buscaPorCPF(cpf);
	}
	
	public Fatura geraFatura(Cliente cliente, double valor) {
		return new Fatura(cliente, valor);
	}
	
	public Cobranca geraCobranca(Fatura fatura) {
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();
		
		return cobranca;
	}
	
	public void realizarContato(Cliente cliente, Cobranca cobranca) {
		ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.envio();
	}
	
}
