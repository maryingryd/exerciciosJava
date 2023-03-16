package ExercicioMetodo1;

import java.util.Scanner;

public class CalculadoraExemplo {

    public static void main(String[] args) {

        // Problema: Classe calculadora capaz de calcular soma, subtração, divisão, multiplicação e potenciação

        Scanner scanner = new Scanner(System.in);

        // Utilizando recursos estáticos
        /*
         * System.out.println("Informe o 1º número:"); Calculadora.numero1 = scanner.nextDouble();
         * 
         * System.out.println("Informe a operação desejada:"); Calculadora.operador = scanner.next();
         * 
         * System.out.println("Informe o 2º número"); Calculadora.numero2 = scanner.nextDouble();
         * 
         * Calculadora.calcular();
         * 
         * System.out.println("Resultado: " + Calculadora.resultado);
         */

        // ----------------------------------------------------------

        // Utilizando recursos de instância
        Calculadora2 calc = new Calculadora2();

        System.out.println("Informe o 1º número:");
        double num1 = scanner.nextDouble();

        System.out.println("Informe a operação desejada:");
        String op = scanner.next();

        System.out.println("Informe o 2º número");
        double num2 = scanner.nextDouble();

        double resultado = calc.calcular(num1, num2, op);

        System.out.println("Resultado: " + resultado);

        scanner.close();

    }

}
