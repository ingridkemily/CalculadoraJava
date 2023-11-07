package calculadora;

 class TesteSubtracao {

    public static void main(String[] args) {
        Subtracao calculadora = new Subtracao();

        // Cenário de teste 1: Subtração de dois valores
        int resultado = calculadora.subtrair(10, 5);
        System.out.println("Resultado da subtração 10 - 5: " + resultado);

        // Cenário de teste 2: Subtração de dois valores, sendo um zero
        resultado = calculadora.subtrair(8, 0);
        System.out.println("Resultado da subtração 8 - 0: " + resultado);
        
        // Cenário de teste 3: Subtração de dois valores, sendo que ambos são zero
        resultado = calculadora.subtrair(0, 0);
        System.out.println("Resultado da subtração 0 - 0: " + resultado);
        
        // Cenário de teste 4: Subtração de dois valores, sendo um negativo
        resultado = calculadora.subtrair(10, -5);
        System.out.println("Resultado da subtração 10 - (-5): " + resultado);
    }
}
