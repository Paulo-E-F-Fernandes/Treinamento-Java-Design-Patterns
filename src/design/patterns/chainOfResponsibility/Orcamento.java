package design.patterns.chainOfResponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author paulo
 */
public class Orcamento {
    
    private double valor;
    private final List<Item> itens; // final pois o atributo não será modificado

    public Orcamento() {
        this.valor = 0;
        this.itens = new ArrayList<>();
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
    
}
