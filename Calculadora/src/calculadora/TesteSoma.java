package calculadora;

/**
 * Classe de teste para a classe Soma.
 *
 * Esta classe contém o método principal para testar a funcionalidade de soma
 * da classe Soma. Ela executa vários cenários de teste para verificar o
 * comportamento da soma, incluindo casos especiais, como soma de zero e soma de números negativos.
 *
 * @author Ingrid Kemily
 * @version 2.0
 */
public class TesteSoma {

    public static void main(String[] args) {
        Soma calculadora = new Soma();

        // Cenário de teste 1: Soma de dois valores
        int numero1 = 5;
        int numero2 = 3;

        int resultado = calculadora.somar(numero1, numero2);

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
        
        // Cenário de teste 2: Soma de dois valores, sendo um zero

        numero1 = 5;
        numero2 = 0;

        resultado = calculadora.somar(numero1, numero2);

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
        
        // Cenário de teste 3: Soma de dois valores, sendo que ambos são zero
        
        numero1 = 0;
        numero2 = 0;

        resultado = calculadora.somar(numero1, numero2);

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
        
        // Cenário de teste 4: Soma de dois valores, sendo um negativo
        
        numero1 = 8;
        numero2 = -4;

        resultado = calculadora.somar(numero1, numero2);

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }
}
