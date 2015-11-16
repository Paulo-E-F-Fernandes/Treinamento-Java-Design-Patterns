package design.patterns.command;

public class TesteCommand {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Cliente 1", 150.0);
		Pedido pedido2 = new Pedido("Cliente 2", 250.0);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido1));
		
		fila.processa();
	}

}
