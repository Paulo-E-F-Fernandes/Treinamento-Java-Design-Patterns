package design.patterns.facade_e_singleton;


public class TesteFacade {

	public static void main(String[] args) {
		// Imagina se temos um sistema grande que controla toda uma empresa,
		//	controla cliente, faturas, cobranças, contato,...
		
		/*
		// *** LÓGICA DO PROGRAMA ***
		// Busca o cliente com o CPF 123.456.789-12
		String cpf = "123.456.789-12";
		Cliente cliente = new ClienteDAO().buscaPorCPF(cpf);
		
		// Gera uma fatura para este cliente
		Fatura fatura = new Fatura(cliente, 5000.0);
		
		// Realiza a cobrança
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();
		
		// Comunica o clinte
		ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.envio();
		// *** FIM LÓGICA DO PROGRAMA ***
		*/
		
		/* 
		 * COMO TEMOS UMA INTEFACE ÚNICA DA NOSSA CLASSE FAÇADE PARA TODOS OS NOSSOS SISTEMAS
		 * 	NÃO É NECESSÁRIO FAZERMOS VÁRIOS new EmpresaFacade(), UM SÓ É SUFICIENTE, SENDO QUE 
		 * 	SE TIVERMOS SEMPRE A MESMA INSTÂNCIA DE FAÇADE É O SUFICIENTE. ISSO PODE ACONTECER
		 *  PELO FATO DO FAÇADE APENAS REPASSAR A INVOCAÇÃO DOS MÉTODOS E TAMBÉM NÃO POSSUI 
		 *  ESTADO. 
		 *  
		 * COMO TEMOS APENAS UMA CLASSE PARA TOMARMOS CONTA PODEMOS UTILIZAR O DESIGN PATTERNS
		 * 	SINGLETON QUE POSSUI A MESMA IDÉIA DO FLYWEIGHT, SÓ QUE ESTE ÚLTIMO É MAIS INDICADO
		 * 	PARA GERENCIAR VÁRIAS CLASSES.
		 *  
		 * 
		EmpresaFacade facade = new EmpresaFacade();
		String cpf = "123.456.789-12";
		Cliente cliente = facade.buscaCliente(cpf);
		Fatura fatura = facade.geraFatura(cliente, 5200.0);
		*/
		
		// Após a criação do Singleton
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
		String cpf = "123.456.789-12";
		Cliente cliente = facade.buscaCliente(cpf);
		Fatura fatura = facade.geraFatura(cliente, 5200.0);
		fatura.toString();
	}
	
}
