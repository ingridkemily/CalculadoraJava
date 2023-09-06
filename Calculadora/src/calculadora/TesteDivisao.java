
package calculadora;

public class TesteDivisao {

    public static void main(String[] args) {
        Divisao calculadora = new Divisao();

        // Cenário de teste 1: multiplicacao de dois valores
        double resultado = calculadora.dividir(2, 5);
        System.out.println("Resultado da divisão 2 / 5: " + resultado);

        // Cenário de teste 2: multiplicacao de dois valores sendo um zero
        try {
            resultado = calculadora.dividir(10, 0);
            System.out.println("Resultado da divisão 10 / 0: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir por zero: " + e.getMessage());
        }
        
        // Cenário de teste 3: multiplicacao de dois valores sendo que ambos são zero
         try {
            resultado = calculadora.dividir(0, 0);
            System.out.println("Resultado da divisão 0 / 0: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir por zero: " + e.getMessage());
        }
        
        // Cenário de teste 4: multiplicacao de dois valores sendo um negativo
        resultado = calculadora.dividir(2, -5);
        System.out.println("Resultado da divisão 2 / (-5): " + resultado);
    }
}

