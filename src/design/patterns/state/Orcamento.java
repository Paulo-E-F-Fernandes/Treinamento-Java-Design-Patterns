package design.patterns.state;

import design.patterns.chainOfResponsibility.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author paulo
 */
public class Orcamento {
    
    protected double valor;
    private final List<Item> itens; // final pois o atributo não será modificado
    
    protected EstadosDeUmOrcamento estadoAtual;
    
    /*
    private int estadoAtual = 1;
    private static final int EM_APROVACAO = 1;
    private static final int APROVADO = 1;
	*/
    
    public Orcamento() {
        this.valor = 0;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }
    
    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }
    
    public void adicionaItem(Item item) {
        valor = valor + item.getValor();
        itens.add(item);
    }

    public List<Item> getItens() {
        // Retorna uma lista imutável.
        // O Collections.unmodifiableList() retornará uma lista que não poderá ser
        //  alterado pelo mundo exterior.
        return Collections.unmodifiableList(itens); 
    }

	public void aplicaDescontoExtra() {
		/*
		// PROBLEMA: Já possui vários ifs e para cada estado novo será necessário adicionar um novo if.
		//	O método tende a crescer e fica cada vez mais complexo.
		if (estadoAtual == EM_APROVACAO) {
			valor = valor - (valor * 0.05); // Desconto de 5% caso esteja nos estado EM_APROVACAO
		} else if (estadoAtual == APROVADO) {
			valor = valor - (valor * 0.02); // Desconto de 2% caso esteja nos estado APROVADO
		} else {
			throw new RuntimeException("Somente orçamentos em aprovação ou aprovados ganham descontos.");
		}
		*/
		
		estadoAtual.aplicaDescontto(this); // Aplicar o desconto nele mesmo, no próprio orçamento.
	}
    
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
}
