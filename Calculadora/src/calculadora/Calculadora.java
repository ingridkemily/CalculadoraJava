
package calculadora;

public interface Calculadora {

    public class Soma implements Calculadora {

        public int somar(int a, int b) {
            return a + b;
        }
    
    }
    
    public class Subtracao implements Calculadora {

    public int subtrair(int a, int b) {
        return a - b;
    }
}
    
    public class Multiplicacao implements Calculadora {

        // Método que realiza a multiplicação de dois números inteiros
        public int multiplicar(int a, int b) {
            return a * b;
        }
}
    public class Divisao implements Calculadora {

    // Método que realiza a divisão de dois números inteiros
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return (double) a / b;
    }
}
}
