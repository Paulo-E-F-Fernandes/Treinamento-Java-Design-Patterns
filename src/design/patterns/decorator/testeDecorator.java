package design.patterns.decorator;

import design.patterns.chainOfResponsibility.Item;
import design.patterns.strategy.Orcamento;

public class testeDecorator {

	/*
	 * O design patterns Decorator é utilizado para juntar comportamento separados, ou seja, no exemplo
	 * dos impostos, cada classe é responsável por realizar o cálculo de apenas um imposto, o Decorator
	 * exibe uma maneira de juntar estes impostos pequenos para criar um imposto maior.
	 * 
	 * Decorator visa juntar comportamentos que estão quebrados em classes diferentes.
	 * 
	 * Como o número de variações de impostos que se deseja calcular pode ser muito grande, 
	 * ficaria impossível criar uma classe para cada variação, com isso este padrão define que a criação de 
	 * um novo construtor e alterações no método de cálculo evitará a criação de muitas classes para juntar 
	 * os impostos, evitando o exemplo abaixo.
	 * 	Imposto iss = new ISS();
	 * 	Imposto issComIcms = new ISSComICMS();
	 * 	Imposto issComIcmsComIkpv = new ISSComICMSComIKPV();
	 */
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new Item("Camiseta", 250.0));
		orcamento.adicionaItem(new Item("Calção", 52.0));
		orcamento.adicionaItem(new Item("Meias", 17.0));
		
		Imposto simulacao1 = new ICMS();
		System.out.println(simulacao1.getNome() + ": " + simulacao1.calcula(orcamento));
		
		Imposto simulacao2 = new ICMS(new ISS());
		System.out.println(simulacao2.getNome() + ": " + simulacao2.calcula(orcamento));
		
		Imposto simulacao3 = new ICMS(new ISS(new IKPV()));
		System.out.println(simulacao3.getNome() + ": " + simulacao3.calcula(orcamento));
	}

}
