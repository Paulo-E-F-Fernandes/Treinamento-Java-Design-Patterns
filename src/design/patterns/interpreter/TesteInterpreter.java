package design.patterns.interpreter;

/* 
 * EXEMPLO: Uma calculadora que receberá uma expressão matematica em forma de texto
 * e terá que avaliar a mesma retornado o resultado desta avaliação.
 */
public class TesteInterpreter {

	public static void main(String[] args) {
		/* 
		 * Exemplo de expressões que devem ser avaliadas:
		 * "2 + 3 / 4 - 1" ou "(2+3) / (4+7+(2/1))*10"
		 */
		
		// 25 + 32 = 57
		Expressao somaSimples = new Soma(new Numero(25), new Numero(32));
		int resultadoSomaSimples = somaSimples.avalia();
		System.out.println(resultadoSomaSimples);
		
		// 20 - 15 = 5
		Expressao esquerdaComplexa = new Subtracao(new Numero(20), new Numero(15));
		// 5 + 20 = 25
		Expressao direitaComplexa = new Soma(new Numero(5), new Numero(20));
		// (20 - 15) + (5 + 20) = 30 
		Expressao somaComplexa = new Soma(esquerdaComplexa, direitaComplexa);
		int resultadoSomaComplexa = somaComplexa.avalia();
		System.out.println(resultadoSomaComplexa);
		
		// (6 + 22) - 15 = 13
		Expressao esquerdaMaisComplexa = new Subtracao(new Soma(new Numero(6), new Numero(22)), new Numero(15));
		// 5 + 20 = 25
		Expressao direitaMaisComplexa = new Soma(new Numero(5), new Numero(20));
		// ((6 + 22) - 15) + (5 + 20) = 38 
		Expressao somaMaisComplexa = new Soma(esquerdaMaisComplexa, direitaMaisComplexa);
		int resultadoSomaMaisComplexa = somaMaisComplexa.avalia();
		System.out.println(resultadoSomaMaisComplexa);
	}
	
}
