package calculadora;

/**
 * Classe de teste para a classe Multiplicacao.
 *
 * Esta classe contém o método principal para testar a funcionalidade de multiplicação
 * da classe Multiplicacao. Ela executa vários cenários de teste para verificar o
 * comportamento da multiplicação, incluindo casos especiais como multiplicação por zero.
 *
 * @author Ingrid Kemily
 * @version 2.0
 */
public class TesteMultiplicacao {

    public static void main(String[] args) {
        Multiplicacao calculadora = new Multiplicacao();

        // Cenário de teste 1: Multiplicação de dois valores
        int resultado = calculadora.multiplicar(4, 5);
        System.out.println("Resultado da multiplicação 4 * 5: " + resultado);

        // Cenário de teste 2: Multiplicação de dois valores, sendo um zero
        resultado = calculadora.multiplicar(0, 9);
        System.out.println("Resultado da multiplicação 0 * 9: " + resultado);
        
        // Cenário de teste 3: Multiplicação de dois valores, sendo que ambos são zero
        resultado = calculadora.multiplicar(0, 0);
        System.out.println("Resultado da multiplicação 0 * 0: " + resultado);
        
        // Cenário de teste 4: Multiplicação de dois valores, sendo um negativo
        resultado = calculadora.multiplicar(4, (-2));
        System.out.println("Resultado da multiplicação 4 * (-2): " + resultado);
    }
}
