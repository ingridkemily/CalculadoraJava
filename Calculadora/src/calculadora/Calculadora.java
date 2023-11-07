package calculadora;

/**
 * Autor: Ingrid Kemily
 * Data: 26/09/2023
 * Versão: 2.0
 */

/**
 * Interface Calculadora - Define operações matemáticas básicas que podem ser realizadas
 * por classes que a implementam.
 */
public interface Calculadora {

    /**
     * Classe Soma - Implementa a interface Calculadora e fornece uma operação de soma.
     */
    public class Soma implements Calculadora {

        /**
         * Realiza a soma de dois números inteiros.
         * @param a - Primeiro número inteiro a ser somado.
         * @param b - Segundo número inteiro a ser somado.
         * @return - Resultado da soma dos números a e b.
         */
        public int somar(int a, int b) {
            return a + b;
        }
    }

    /**
     * Classe Subtracao - Implementa a interface Calculadora e fornece uma operação de subtração.
     */
    public class Subtracao implements Calculadora {

        /**
         * Realiza a subtração de dois números inteiros.
         * @param a - Número inteiro do qual se subtrairá.
         * @param b - Número inteiro a ser subtraído de a.
         * @return - Resultado da subtração de b de a.
         */
        public int subtrair(int a, int b) {
            return a - b;
        }
    }

    /**
     * Classe Multiplicacao - Implementa a interface Calculadora e fornece uma operação de multiplicação.
     */
    public class Multiplicacao implements Calculadora {

        /**
         * Realiza a multiplicação de dois números inteiros.
         * @param a - Primeiro número inteiro a ser multiplicado.
         * @param b - Segundo número inteiro a ser multiplicado.
         * @return - Resultado da multiplicação dos números a e b.
         */
        public int multiplicar(int a, int b) {
            return a * b;
        }
    }

    /**
     * Classe Divisao - Implementa a interface Calculadora e fornece uma operação de divisão.
     */
    public class Divisao implements Calculadora {

        /**
         * Realiza a divisão de dois números inteiros.
         * @param a - Número inteiro a ser dividido (dividendo).
         * @param b - Número inteiro pelo qual a será dividido (divisor).
         * @return - Resultado da divisão de a por b como um número de ponto flutuante.
         * @throws ArithmeticException - Se b for igual a zero, indicando uma divisão por zero.
         */
        public double dividir(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Não é possível dividir por zero.");
            }
            return (double) a / b;
        }
    }
}
