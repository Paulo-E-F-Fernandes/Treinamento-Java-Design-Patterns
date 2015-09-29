package design.patterns.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author paulo
 */
class NotaFiscalBuilderInterfacesFluentes {
    
    private String razaoSocial;
    private String cnpj;
    // É final pois a lista já é inicializada, não sendo inicializada novamente.
    private final List<ItemDaNota> itens = new ArrayList<>();
    private double valorBruto = 0;
    private double valorImpostos = 0;
    private String observacoes;
    private Calendar dataEmissao;
    
    // Agora ao invés de conhecermos cada um dos comportamentos, vamos estar aclopados
    //	a uma lista de AcaoAposGerarNotaFiscal.
    List<AcaoAposGerarNotaFiscal> listaDeAcoes;
    
    public NotaFiscalBuilderInterfacesFluentes() {
    	// Precisamos iniciar a lista para não tomar NullPointerException.
    	// Então vamos colocar no construtor da classe esta inicialização.
		this.listaDeAcoes = new ArrayList<>();
	}
    
    // Precisamos de um métodos para adicionar acões na lista de ações.
    public void adicionaAcao(AcaoAposGerarNotaFiscal acao) {
    	this.listaDeAcoes.add(acao);
    }
    
    public NotaFiscalBuilderInterfacesFluentes paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        // Para poder ser utilizado o estilo de Interfaces Fluentes, necessitamos retornar o próprio objeto.
        return this;
    }
    
    public NotaFiscalBuilderInterfacesFluentes comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public NotaFiscalBuilderInterfacesFluentes comItem(ItemDaNota item) {
        this.itens.add(item);
        this.valorBruto += item.getValor();
        this.valorImpostos += item.getValor() * 0.05;
        return this;
    }
    
    public NotaFiscalBuilderInterfacesFluentes comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }
    
    public NotaFiscalBuilderInterfacesFluentes comDataEmissao() {
        this.dataEmissao = Calendar.getInstance();
        return this;
    }

/* PROBLEMA: A classe está fazendo muita coisa, com isso ela ficou bastante complexa.
			 Além de gerar a Nota Fiscal, a classe tem a responsabilidade de enviar a nota por e-mail,
			 	enviar a nota por SMS, imprimir a nota e gravar no banco.
				
			 Vamos quebrar os comportamento em pequenas classes.
			 
		
    // Método que constroi a NotaFiscal com base nas informações que ele já possui.
    public NotaFiscal constroi() {
    	// Antes de retornar a Nota Fiscal, vamos executar os procedimento de gravar no DB, enviar e-mail,etc.
    	NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, valorImpostos, itens, observacoes); 
    	
    	// Para separar os comportamentos vamos criar métodos privados.
    	enviarPorEmail(nf);
    	gravarNoBanco(nf);
    	enviarPorSMS(nf);
    	imprime(nf);
    	
        return nf;
    }
    
	private void imprime(NotaFiscal nf) {
		System.out.println("Imprimir Nota Fiscal!");
	}

	private void enviarPorSMS(NotaFiscal nf) {
		System.out.println("Enviar SMS!");
	}

	private void gravarNoBanco(NotaFiscal nf) {
		System.out.println("Gravar no banco!");
	}

	private void enviarPorEmail(NotaFiscal nf) {
		System.out.println("Enviar e-mail!");
	}
*/
    
/* PROBLEMA: Agora o comportamento está isolado em cada classe, mas o problema desta classe
				é o ACLOPAMENTO, pois a classe depende das classes NotaFiscalDAO, EnviadorDeEmail, 
				EnviadorDeSMS e Impressora, e este aclopamento só tende a crescer, pois a cada comportamento
				novo que quisermos colocar será necessário criar um nova linha e isso poderá crescer muito.
				
				Como diminuir este ACLOPAMENTO? Como todas as classes que estão aclopados a está, possuem um 
				método que recebe a NotaFiscal, podemos criar uma INTERFACE, neste caso é a interface 
				AcaoAposGerarNotaFiscal e vamos fazer com que todos os comportamento implementem esta 
				interface.
    
    // Método que constroi a NotaFiscal com base nas informações que ele já possui.
    public NotaFiscal constroi() {
    	NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, valorImpostos, itens, observacoes);
    	
    	new NotaFiscalDAO().gravarNoBanco(nf);
    	new EnviadorDeEmail().enviarPorEmail(nf);
    	new EnviadorDeSMS().enviarPorSMS(nf);
    	new Impressora().imprime(nf);
    	
    	return nf;
    }
*/
    
    public NotaFiscal constroi() {
    	NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, valorImpostos, itens, observacoes);
    	
    	// Agora esta classe não conhece um comportamento específico e sim comportamentos genérico
    	//	que estão contidos em uma lista.
    	for (AcaoAposGerarNotaFiscal acao : listaDeAcoes) {
    		acao.executa(nf);
    	}
    	
    	return nf;
    }
    
}
