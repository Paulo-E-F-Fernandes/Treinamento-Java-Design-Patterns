package design.patterns.command;

public class PagaPedido implements Comando {

	private Pedido p;

	public PagaPedido(Pedido p) {
		this.p = p;
	}
	
	@Override
	public void executa() {
		System.out.println("Pagando o pedido do cliente " + p.getCliente());
		p.paga();
	}

}
