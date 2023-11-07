package calculadora;

/**
 * Classe de teste para a classe Divisao.
 *
 * Esta classe contém o método principal para testar a funcionalidade de divisão
 * da classe Divisao. Ela executa vários cenários de teste para verificar o
 * comportamento da divisão, incluindo casos especiais como divisão por zero.
 *
 * @author Ingrid Kemily
 * @version 2.0
 */
public class TesteDivisao {

    public static void main(String[] args) {
        Divisao calculadora = new Divisao();

        // Cenário de teste 1: Divisão de dois valores
        double resultado = calculadora.dividir(2, 5);
        System.out.println("Resultado da divisão 2 / 5: " + resultado);

        // Cenário de teste 2: Divisão de dois valores, sendo um zero
        try {
            resultado = calculadora.dividir(10, 0);
            System.out.println("Resultado da divisão 10 / 0: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir por zero: " + e.getMessage());
        }
        
        // Cenário de teste 3: Divisão de dois valores, sendo que ambos são zero
         try {
            resultado = calculadora.dividir(0, 0);
            System.out.println("Resultado da divisão 0 / 0: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir por zero: " + e.getMessage());
        }
        
        // Cenário de teste 4: Divisão de dois valores, sendo um negativo
        resultado = calculadora.dividir(2, -5);
        System.out.println("Resultado da divisão 2 / (-5): " + resultado);
    }
}
