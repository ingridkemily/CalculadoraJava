
package calculadora;

public class TesteMultiplicacao {

    public static void main(String[] args) {
        Multiplicacao calculadora = new Multiplicacao();

        // Cenário de teste 1: multiplicacao de dois valores
        int resultado = calculadora.multiplicar(4, 5);
        System.out.println("Resultado da multiplicação 4 * 5: " + resultado);

        // Cenário de teste 2: multiplicacao de dois valores sendo um zero
        resultado = calculadora.multiplicar(0, 9);
        System.out.println("Resultado da multiplicação 0 * 9: " + resultado);
        
        // Cenário de teste 3: multiplicacao de dois valores sendo que ambos são zero
        resultado = calculadora.multiplicar(0, 0);
        System.out.println("Resultado da multiplicação 0 * 0: " + resultado);
        
        // Cenário de teste 4: multiplicacao de dois valores sendo um negativo
        resultado = calculadora.multiplicar(4, (-2));
        System.out.println("Resultado da multiplicação 4 * (-2): " + resultado);

    }
}
